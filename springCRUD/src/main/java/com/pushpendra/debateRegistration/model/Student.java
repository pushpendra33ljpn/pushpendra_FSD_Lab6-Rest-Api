package com.pushpendra.debateRegistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	private String sFirstname;
	private String sLastname;
	private String sCourse;
	private String sCountry;
	
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getsFirstname() {
		return sFirstname;
	}
	public void setsFirstname(String sFirstname) {
		this.sFirstname = sFirstname;
	}
	public String getsLastname() {
		return sLastname;
	}
	public void setsLastname(String sLastname) {
		this.sLastname = sLastname;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	public String getsCountry() {
		return sCountry;
	}
	public void setsCountry(String sCountry) {
		this.sCountry = sCountry;
	}
	
	
	
}
