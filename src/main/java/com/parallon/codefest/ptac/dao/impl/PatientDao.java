package com.parallon.codefest.ptac.dao.impl;

import java.util.Date;

import com.parallon.codefest.ptac.dao.IPatientDao;
import com.parallon.codefest.ptac.model.Patient;

public class PatientDao implements IPatientDao {
	
	@Override
	public Patient getPatient(long patientNo, String unitNo) {

		Patient patient = new Patient();
		
		patient.setAdmitDate(new Date());
		patient.setModifiedDate(new Date());
		patient.setCoid("coid.. ");
		patient.setPatientName("Mr Josh");
		patient.setPatientNumber(123124L);
		patient.setTotalCharges(1234.5);
		
		return patient;
		 
	}
	
}
