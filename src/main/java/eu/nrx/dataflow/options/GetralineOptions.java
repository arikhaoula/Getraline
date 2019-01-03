package eu.nrx.dataflow.options;

import org.apache.beam.sdk.options.Default;
import org.apache.beam.sdk.options.Description;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.Validation;
import org.apache.beam.sdk.options.Validation.Required;

public interface GetralineOptions extends PipelineOptions {

    /**
     * By default, this example reads from a public dataset containing the text of King Lear. Set
     * this option to choose a different input file or glob.
     */
    @Description("Path of the file to read from")
    @Default.String("gs://storagebucket-getraline/datasample.json")
    String getInputFile();
    
    void setInputFile(String value);
    /** Set this required option to specify where to write the output. */
    @Description("Path of the file to write to")
    @Required
    String getOutput();

    void setOutput(String value);
    
    
    @Description("BigQuery Dataset to write tables to. Must already exist.")
    @Validation.Required
    String getOutputDataset();
    void setOutputDataset(String value);

    @Description("The BigQuery table name. Should not already exist.")
    @Validation.Required
    String getOutputTableName();
    void setOutputTableName(String value);
    

  }