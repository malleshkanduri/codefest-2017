package com.parallon.codefest.ptac.dao;

import com.parallon.codefest.ptac.model.Patient;

public interface IPatientDao {
	
	Patient getPatient(long patientNo, String unitNo);
	
}
