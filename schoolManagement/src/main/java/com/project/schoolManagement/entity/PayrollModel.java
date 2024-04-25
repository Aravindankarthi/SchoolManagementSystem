package com.project.schoolManagement.entity;

public class PayrollModel {

	private String classValue,secValue,yearValue;

	@Override
	public String toString() {
		return "PayrollModel [classValue=" + classValue + ", secValue=" + secValue + ", yearValue=" + yearValue + "]";
	}

	public String getClassValue() {
		return classValue;
	}

	public void setClassValue(String classValue) {
		this.classValue = classValue;
	}

	public String getSecValue() {
		return secValue;
	}

	public void setSecValue(String secValue) {
		this.secValue = secValue;
	}

	public String getYearValue() {
		return yearValue;
	}

	public void setYearValue(String yearValue) {
		this.yearValue = yearValue;
	}

	
}
