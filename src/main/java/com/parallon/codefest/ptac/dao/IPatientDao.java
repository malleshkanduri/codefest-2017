package com.parallon.codefest.ptac.dao;

import java.util.Collection;
import java.util.List;

import com.parallon.codefest.ptac.model.Patient;

public interface IPatientDao {
	
	List<Patient> getAllPatients();
	
	List<Patient> getPatientsByAcctNo(long patientNo);
	
	Patient getPatientByAcctNoAndUnitNo(long patientNo, String unitNo);
	
}
