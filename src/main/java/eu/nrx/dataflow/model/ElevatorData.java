package eu.nrx.dataflow.model;

import java.util.Date;

public class ElevatorData {
	
	
	private Date ts; // heure de la mesure
	private Integer noEq; // no équipement
	private Integer nb ; // nombre de circulation dans l'heure
	
	
	public ElevatorData(Date ts, Integer noEq, Integer nb, Integer dur) {
		super();
		this.ts = ts;
		this.noEq = noEq;
		this.nb = nb;
		this.dur = dur;
	}
	private Integer dur ; // durée de circulation


	public Date getTs() {
		return ts;
	}
	public void setTs(Date ts) {
		this.ts = ts;
	}
	public Integer getNoEq() {
		return noEq;
	}
	public void setNoEq(Integer noEq) {
		this.noEq = noEq;
	}
	public Integer getNb() {
		return nb;
	}
	public void setNb(Integer nb) {
		this.nb = nb;
	}
	public Integer getDur() {
		return dur;
	}
	public void setDur(Integer dur) {
		this.dur = dur;
	}	

}
