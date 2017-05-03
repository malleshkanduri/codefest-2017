package com.parallon.codefest.ptac.model;

import java.util.Date;

public class Patient {
	long patientNumber;
	String patientName;
	String coid;
	Date admitDate;
	Date modifiedDate;
	Double totalCharges;

	public long getPatientNumber() {
		return patientNumber;
	}
	public void setPatientNumber(long patientNumber) {
		this.patientNumber = patientNumber;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getCoid() {
		return coid;
	}
	public void setCoid(String coid) {
		this.coid = coid;
	}
	public Date getAdmitDate() {
		return admitDate;
	}
	public void setAdmitDate(Date admitDate) {
		this.admitDate = admitDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public Double getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(Double totalCharges) {
		this.totalCharges = totalCharges;
	}
	@Override
	public String toString() {
		return "Patient [patientNumber=" + patientNumber + ", patientName=" + patientName + ", coid=" + coid
				+ ", admitDate=" + admitDate + ", modifiedDate=" + modifiedDate + ", totalCharges=" + totalCharges
				+ "]";
	}
	
}
