package eu.nrx.dataflow;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.extensions.gcp.options.GcpOptions;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.io.gcp.bigquery.BigQueryIO;
import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.options.Validation;
import org.apache.beam.sdk.options.Validation.Required;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.DoFn.ProcessContext;
import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.values.POutput;

import com.google.api.services.bigquery.model.TableReference;

import eu.nrx.dataflow.options.GetralineOptions;

public class GetralinePipeline {
	
	
	 
	/*
	  static class GroupPublished extends PTransform<PCollection<String>,PCollection<KV<DatePosPlatKey, Long>>> {
		  public PCollection<KV<DatePosPlatKey, Long>> apply(PCollection<String> lines) {
		      PCollection<DatePosPlatKey> keyList
		              = lines.apply(ParDo.of(new JsonToDatePosPlatKeyFn()));
		
		      PCollection<KV<DatePosPlatKey, Long>> keysCounted =
		              keyList.apply(Count.<DatePosPlatKey>perElement());
		
		      return keysCounted;
		  }
		}
	  */
	  

	public static void main(String[] args) {
		
	    //PipelineOptionsFactory.register(GetralineOptions.class);
	    GetralineOptions options = PipelineOptionsFactory.fromArgs(args)
	                                              .withValidation()
	                                              .as(GetralineOptions.class);
	 
	    // Create the Pipeline with the specified options.
	    Pipeline p = Pipeline.create(options);
	    /**
	     * 
	     * example of Pcollection without using an interface 
	     * 
	     * PCollection<String> lines = p.apply("ReadLines", TextIO.read().from("gs://storagebucket-getraline/datasample.json"));
	     */

		  PCollection<String> lines = p.apply("ReadJson", TextIO.read().from(options.getInputFile()));
		  
		  lines.apply("WriteMyFile", TextIO.write().to("gs://storagebucket-getraline/getralineoutput.json"));
		  p.run().waitUntilFinish();
		  
		  
		  /*
		    p.apply(TextIO.Read.named("ReadJson").from(options.getInputFile())) 
		        .apply(new GroupPublished())
		        .apply(ParDo.of(new FormatAsStringFn()))
		        .apply(TextIO.Write.named("WriteCounts").to(options.getOutput())); 
		    
		  // Create a bigquery table 
		    TableReference tableRef = new TableReference();
		    tableRef.setDatasetId(options.as(GetralineOptions.class).getOutputDataset());
		    tableRef.setProjectId(options.as(GcpOptions.class).getProject());
		    tableRef.setTableId(options.getOutputTableName());
		  
	        POutput apply = p.apply(
	                BigQueryIO.Write.to(tableRef));  */
		
		
		  		 
	    
	}

}
