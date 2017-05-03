package com.parallon.codefest.ptac.endpoint;

import org.apache.log4j.Logger;
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

public class PatientRest {
	
	private static final Logger LOGGER = Logger.getLogger(PatientRest.class);

    @RequestMapping(value="/{accountNumber}", method = RequestMethod.GET)
    public Patient getPatient(@PathVariable long accountNumber, @RequestParam(value="unit", required = false) String unitNo) {
     		
    	LOGGER.info("getPatient {accountNumber}" + accountNumber + ", unitNo " + unitNo );

    	IPatientService service  = new PatientService();
    	
     	Patient patient = service.getPatient(accountNumber, unitNo);
     	
     	LOGGER.info("getPatient {accountNumber}" + accountNumber  + " END" );
     	
        return patient;
    }
    
    
    @RequestMapping(value="/{accountNumber}", method = RequestMethod.POST)
    public Patient updatePatient(@PathVariable long accountNumber, @RequestBody Patient patient) {
     		
    	LOGGER.info("updatePatient {accountNumber}" + accountNumber + ", patient " + patient );

        return patient;
    }
    
}
