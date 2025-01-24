package com.cjc.main.crud.model;

import java.time.LocalDateTime;

public class Transaction {
	
	private double traamt;
	private String type;
	private double rembal;
	private LocalDateTime ldt;
	
	
	
	public LocalDateTime getLdt() {
		return ldt;
	}
	public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	}
	public double getRembal() {
		return rembal;
	}
	public void setRembal(double rembal) {
		this.rembal = rembal;
	}
	public double getTraamt() {
		return traamt;
	}
	public void setTraamt(double traamt) {
		this.traamt = traamt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [traamt=" + traamt + ", type=" + type + ", rembal=" + rembal + ", ldt=" + ldt + "]";
	}
	
	
	

}
