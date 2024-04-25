package com.project.schoolManagement.entity;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StaffEntity {
@Id
private String name;
private String email,mname,fname;
private long mnum;
private Date dob;
private int exp;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public long getMnum() {
	return mnum;
}
public void setMnum(long mnum) {
	this.mnum = mnum;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}


}
