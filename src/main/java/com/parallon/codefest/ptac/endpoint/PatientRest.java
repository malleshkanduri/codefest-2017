package com.parallon.codefest.ptac.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parallon.codefest.ptac.dao.service.IPatientService;
import com.parallon.codefest.ptac.dao.service.impl.PatientService;
import com.parallon.codefest.ptac.model.Patient;



@RestController
@RequestMapping("/patient")
@CrossOrigin

public class PatientRest {
	
	private static final Logger LOGGER = Logger.getLogger(PatientRest.class);

    @RequestMapping(value="/{accountNumber}", method = RequestMethod.GET)
    public List<Patient> getPatient(@PathVariable long accountNumber, @RequestParam(value="unit", required = false) String unitNo) {
     		
    	LOGGER.info("getPatient {accountNumber}" + accountNumber + ", unitNo " + unitNo );

    	IPatientService service  = new PatientService();
    	
    	List<Patient> patients = new ArrayList<Patient>();
    	
    	if (unitNo != null && unitNo.trim().length() > 0) {
    		Patient patient = service.getPatientByAccountNoAndUnitNo(accountNumber, unitNo);
    		patients.add(patient);
    	} else {
    	
    		patients = service.getPatientsByAccountNo(accountNumber);
    	}
     	LOGGER.info("getPatient {accountNumber}" + accountNumber  + " END" );
     	
        return patients;
    }
    
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Patient> getAllPatients() {
     		

    	IPatientService service  = new PatientService();
    	
     	List<Patient> patients = service.getAllPatients();
     	
        return patients;
    }
    
    
    
    @RequestMapping(value="/{accountNumber}", method = RequestMethod.POST)
    public Patient updatePatient(@PathVariable long accountNumber, @RequestBody Patient patient) {
     		
    	LOGGER.info("updatePatient {accountNumber}" + accountNumber + ", patient " + patient );

        return patient;
    }
    
}
