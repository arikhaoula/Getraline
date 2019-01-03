package eu.nrx.dataflow.model;

import java.util.Date;

public class VmcData {

	private Date tsSd;// heure transmission
	private Date tsRv;
	private Integer noEq;// no équipement
	private Double batt; // tension batterie
	private Double vacu;// valeur dépression
	private Double tout;// température extérieure
	private Double humi; // humidité
	private Double tin; // température ambiante
	private String gatw;
	private Integer rssi;// identifiant passerelle
	private Double nois;// bruit
	private Double freq; // fréquence
	
	
	public VmcData(Date tsSd, Date tsRv, Integer noEq, Double batt, Double vacu, Double tout, Double humi, Double tin,
			String gatw, Integer rssi, Double nois, Double freq) {
		super();
		this.tsSd = tsSd;
		this.tsRv = tsRv;
		this.noEq = noEq;
		this.batt = batt;
		this.vacu = vacu;
		this.tout = tout;
		this.humi = humi;
		this.tin = tin;
		this.gatw = gatw;
		this.rssi = rssi;
		this.nois = nois;
		this.freq = freq;
	}

	@Override
	public String toString() {
		return "VmcData [tsSd=" + tsSd + ", tsRv=" + tsRv + ", noEq=" + noEq + ", batt=" + batt + ", vacu=" + vacu
				+ ", tout=" + tout + ", humi=" + humi + ", tin=" + tin + ", gatw=" + gatw + ", rssi=" + rssi + ", nois="
				+ nois + ", freq=" + freq + "]";
	}

	public Date getTsSd() {
		return tsSd;
	}

	public void setTsSd(Date tsSd) {
		this.tsSd = tsSd;
	}

	public Date getTsRv() {
		return tsRv;
	}

	public void setTsRv(Date tsRv) {
		this.tsRv = tsRv;
	}

	public Integer getNoEq() {
		return noEq;
	}

	public void setNoEq(Integer noEq) {
		this.noEq = noEq;
	}

	public Double getBatt() {
		return batt;
	}

	public void setBatt(Double batt) {
		this.batt = batt;
	}

	public Double getVacu() {
		return vacu;
	}

	public void setVacu(Double vacu) {
		this.vacu = vacu;
	}

	public Double getTout() {
		return tout;
	}

	public void setTout(Double tout) {
		this.tout = tout;
	}

	public Double getHumi() {
		return humi;
	}

	public void setHumi(Double humi) {
		this.humi = humi;
	}

	public Double getTin() {
		return tin;
	}

	public void setTin(Double tin) {
		this.tin = tin;
	}

	public String getGatw() {
		return gatw;
	}

	public void setGatw(String gatw) {
		this.gatw = gatw;
	}

	public Integer getRssi() {
		return rssi;
	}

	public void setRssi(Integer rssi) {
		this.rssi = rssi;
	}

	public Double getNois() {
		return nois;
	}

	public void setNois(Double nois) {
		this.nois = nois;
	}

	public Double getFreq() {
		return freq;
	}

	public void setFreq(Double freq) {
		this.freq = freq;
	}
	
	
 
    
    
    
    
    
}
