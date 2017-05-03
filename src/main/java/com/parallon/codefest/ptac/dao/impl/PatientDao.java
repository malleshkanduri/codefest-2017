package com.parallon.codefest.ptac.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.parallon.codefest.ptac.dao.IPatientDao;
import com.parallon.codefest.ptac.model.Patient;
import com.parallon.codefest.ptac.util.DBStore;

public class PatientDao implements IPatientDao {

	@Override
	public List<Patient> getAllPatients() {
		Set<Entry<Long,List<Patient>>> entrySet = DBStore.db.entrySet();
		List<Patient> list = new ArrayList<Patient>();
		
		
		for (Entry<Long, List<Patient>> entry : entrySet) {
			List<Patient> value = entry.getValue();
			list.addAll(value);
		}
		
		return list;
	}

	@Override
	public List<Patient> getPatientsByAcctNo(long patientNo) {
		return DBStore.db.get(patientNo);
	}

	@Override
	public Patient getPatientByAcctNoAndUnitNo(long patientNo, String unitNo) {
		List<Patient> list = DBStore.db.get(patientNo);
		
		for (Patient patient : list) {
			long parseLong = Long.parseLong(unitNo);
			if (parseLong == patient.getUnit()) {
				return patient;
			}
		}
		return null;
	}
}
