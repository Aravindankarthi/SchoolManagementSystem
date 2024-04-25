package com.project.schoolManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Staff")
public class PayRollEntity {
	@Id
	private int StaffID;
	private int Year,Class;
	private String Name,Roll,Department,Designation,Status,Section,Mobile;
	
    public int getStaffID() {
		return StaffID;
	}
	public void setStaffID(int staffID) {
		StaffID = staffID;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public int gettClass() {
		return Class;
	}
	public void setClass(int class1) {
		Class = class1;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRoll() {
		return Roll;
	}
	public void setRoll(String roll) {
		Roll = roll;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	
    
}
