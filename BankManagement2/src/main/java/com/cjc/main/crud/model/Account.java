package com.cjc.main.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Account {

	@Id
	private int id;
	
	private long accno;
	private String name;
	private String uname;
	private double balence;
	private String pass;
	private long mobile;
	private String city;
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accno=" + accno + ", name=" + name + ", uname=" + uname + ", balence=" + balence
				+ ", pass=" + pass + ", mobile=" + mobile + ", city=" + city + "]";
	}
	
}
