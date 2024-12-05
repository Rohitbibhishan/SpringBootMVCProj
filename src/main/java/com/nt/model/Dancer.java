package com.nt.model;

import java.sql.Date;

//import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="DANCER_DTLS")
public class Dancer {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer did;
	
	@Column(name = "NAME")
	private String name;
	
	private Date dob;
	
	private Long phno;
	
	private String addrs;
	
	private String sex;
	
	private String form;
	
	private Float fee;
	
	//private Option country;
	
    public Dancer() {
		
		System.out.println("Dancer-0 param conturctor");
		
	}
    
	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public Integer getDid() {
		return did;
	}


	public void setDid(Integer did) {
		this.did = did;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}


	public void setPhno(Long phno) {
		this.phno = phno;
	}


	public String getAddrs() {
		return addrs;
	}


	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}


	public String getForm() {
		return form;
	}


	public void setForm(String form) {
		this.form = form;
	}


	public Float getFee() {
		return fee;
	}


	public void setFee(Float fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Dancer [did=" + did + ", name=" + name + ", dob=" + dob + ", phno=" + phno + ", addrs=" + addrs
				+ ", sex=" + sex + ", form=" + form + ", fee=" + fee + "]";
	}

	
	
	   
}
