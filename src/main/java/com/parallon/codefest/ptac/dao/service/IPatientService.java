package com.parallon.codefest.ptac.dao.service;

import java.util.List;

import com.parallon.codefest.ptac.model.Patient;

public interface IPatientService {
	Patient getPatientByAccountNoAndUnitNo(long accountNumber, String unitNo);
	
	List<Patient> getAllPatients();
	
	List<Patient> getPatientsByAccountNo(long accountNumber);
}
