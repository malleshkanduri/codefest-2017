package com.parallon.codefest.ptac.dao.service;

import com.parallon.codefest.ptac.model.Patient;

public interface IPatientService {
	Patient getPatient(long accountNumber, String unitNo);
}
