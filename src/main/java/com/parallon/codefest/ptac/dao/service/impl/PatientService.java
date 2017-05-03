package com.parallon.codefest.ptac.dao.service.impl;

import com.parallon.codefest.ptac.dao.IPatientDao;
import com.parallon.codefest.ptac.dao.impl.PatientDao;
import com.parallon.codefest.ptac.dao.service.IPatientService;
import com.parallon.codefest.ptac.model.Patient;

public class PatientService implements IPatientService{

	@Override
	public Patient getPatient(long accountNumber, String unitNo) {
		IPatientDao dao = new PatientDao();
		return dao.getPatient(accountNumber, unitNo);
	}
}
