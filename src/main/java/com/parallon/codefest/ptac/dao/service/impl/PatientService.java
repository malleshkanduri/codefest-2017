package com.parallon.codefest.ptac.dao.service.impl;

import java.util.List;

import com.parallon.codefest.ptac.dao.IPatientDao;
import com.parallon.codefest.ptac.dao.impl.PatientDao;
import com.parallon.codefest.ptac.dao.service.IPatientService;
import com.parallon.codefest.ptac.model.Patient;

public class PatientService implements IPatientService{

	@Override
	public Patient getPatientByAccountNoAndUnitNo(long accountNumber, String unitNo) {
		IPatientDao dao = new PatientDao();
		return dao.getPatientByAcctNoAndUnitNo(accountNumber, unitNo);
	}

	@Override
	public List<Patient> getAllPatients() {
		IPatientDao dao = new PatientDao();
		return dao.getAllPatients();
	}

	@Override
	public List<Patient> getPatientsByAccountNo(long accountNumber) {
		IPatientDao dao = new PatientDao();
		return dao.getPatientsByAcctNo(accountNumber);
	}
}
