package com.parallon.codefest.ptac.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.security.auth.login.AccountException;
import javax.swing.event.PopupMenuListener;

import com.parallon.codefest.ptac.model.Patient;

public class DBStore {
	public static Map<Long, List<Patient>> db = new HashMap<Long, List<Patient>>();;
	
	static {
		populateData();
	}
	
	public static void populateData() {
		
		Patient p1 = new Patient();
		
		p1.setID(4);
		p1.setFacility("Devcon4");
		p1.setUnit(8941);
		p1.setFacility_Mnemonic("dvcn");
		p1.setAccount_Mnemonic("A1234567");
		p1.setAccount_Number(123567);
		p1.setPatient_Name("Jon Smith");
		p1.setDOB("01/01/1899");
		p1.setPatient_Address("1100 street avenue lane");
		p1.setHome_Phone(5555156155L);
		p1.setPatient_Employer("Not Parallon");
		p1.setICD_10_DX_Code("A312");
		p1.setSchedule_Date("1/2/2017");
		p1.setSchedule_Time("11:00:00");
		p1.setBook_date("1/1/2017");
		p1.setPreop_date("1/1/2017");
		p1.setLocation("reg station");
		p1.setAdmit_MD("smith");
		p1.setAdmitting_MD_Phone(5555156150L);
		p1.setPhysician_Address("110 street lane");
		p1.setPhysician_NPI("N1100222");
		p1.setReason_For_Visit("bad");
		p1.setCPT(123);
		p1.setPatient_Type("OS");
		p1.setAccount_Type("A");
		p1.setAccount_Status("D");
		p1.setAdmit_Date("1/2/2017");
		p1.setPre_Registration_Status("Hurt");
		p1.setFinancial_Class(18);
		p1.setMRI_Unit_Number(8943);
		p1.setMRI_URN("a123");
		p1.setAPPT_URN("b456");
		p1.setAppt_Sch_Notes("Notes of stuff n things");
		p1.setAppt_Date("1/2/17");
		p1.setDischarge_date("5/2/17");
		
		store(p1);
		  
	    p1 = new Patient();
		p1.setID(2);
		p1.setFacility("Devcon2");
		p1.setUnit(8942);
		p1.setFacility_Mnemonic("dvcn");
		p1.setAccount_Mnemonic("A1234567");
		p1.setAccount_Number(123568);
		p1.setPatient_Name("Jane Smith");
		p1.setDOB("01/01/1989");
		p1.setPatient_Address("1100 street avenue lane");
		p1.setHome_Phone(5555156155L);
		p1.setPatient_Employer("Not Parallon");
		p1.setICD_10_DX_Code("A312");
		p1.setSchedule_Date("5/1/2017");
		p1.setSchedule_Time("11:00:00");
		p1.setBook_date("4/30/2017");
		p1.setPreop_date("5/3/2017");
		p1.setLocation("reg station");
		p1.setAdmit_MD("smith");
		p1.setAdmitting_MD_Phone(5555156150L);
		p1.setPhysician_Address("110 street lane");
		p1.setPhysician_NPI("N1100222");
		p1.setReason_For_Visit("bad");
		p1.setCPT(123);
		p1.setPatient_Type("I");
		p1.setAccount_Type("A");
		p1.setAccount_Status("D");
		p1.setAdmit_Date("5/3/2017");
		p1.setPre_Registration_Status("Hurt");
		p1.setFinancial_Class(18);
		p1.setMRI_Unit_Number(8943);
		p1.setMRI_URN("a123");
		p1.setAPPT_URN("b456");
		p1.setAppt_Sch_Notes("Notes of stuff n things");
		p1.setAppt_Date("5/2/17");
		p1.setDischarge_date("5/2/17");
		 
		store(p1);
				
		p1 = new Patient();
		p1.setID(3);
		p1.setFacility("Devcon3");
		p1.setUnit(8942);
		p1.setFacility_Mnemonic("dvcn");
		p1.setAccount_Mnemonic("A1234567");
		p1.setAccount_Number(123569);
		p1.setPatient_Name("Joe Doe");
		p1.setDOB("01/01/1979");
		p1.setPatient_Address("1100 street avenue lane");
		p1.setHome_Phone(5555156155L);
		p1.setPatient_Employer("Not Parallon");
		p1.setICD_10_DX_Code("A312");
		p1.setSchedule_Date("5/2/2017");
		p1.setSchedule_Time("11:00:00");
		p1.setBook_date("5/1/2017");
		p1.setPreop_date("5/2/2017");
		p1.setLocation("reg station");
		p1.setAdmit_MD("smith");
		p1.setAdmitting_MD_Phone(5555156150L);
		p1.setPhysician_Address("110 street lane");
		p1.setPhysician_NPI("N1100222");
		p1.setReason_For_Visit("bad");
		p1.setCPT(123);
		p1.setPatient_Type("OS");
		p1.setAccount_Type("A");
		p1.setAccount_Status("D");
		p1.setAdmit_Date("5/2/2017");
		p1.setPre_Registration_Status("Hurt");
		p1.setFinancial_Class(18);
		p1.setMRI_Unit_Number(8943);
		p1.setMRI_URN("a123");
		p1.setAPPT_URN("b456");
		p1.setAppt_Sch_Notes("Notes of stuff n things");
		p1.setAppt_Date("5/2/17");
		p1.setDischarge_date("5/2/17");
		
		store(p1);

		p1 = new Patient();
		/*p1.setID(4);
		p1.setFacility("Devcon4");
		p1.setUnit(8941);
		p1.setFacility_Mnemonic("dvcn");
		p1.setAccount_Mnemonic("A1234567");
		p1.setAccount_Number(123567);
		p1.setPatient_Name("Jon Smith");
		p1.setDOB("01/01/1899");
		p1.setPatient_Address("1100 street avenue lane");
		p1.setHome_Phone(5555156155L);
		p1.setPatient_Employer("Not Parallon");
		p1.setICD_10_DX_Code("A312");
		p1.setSchedule_Date("1/2/2017");
		p1.setSchedule_Time("11:00:00");
		p1.setBook_date("1/1/2017");
		p1.setPreop_date("1/1/2017");
		p1.setLocation("reg station");
		p1.setAdmit_MD("smith");
		p1.setAdmitting_MD_Phone(5555156150L);
		p1.setPhysician_Address("110 street lane");
		p1.setPhysician_NPI("N1100222");
		p1.setReason_For_Visit("bad");
		p1.setCPT(123);
		p1.setPatient_Type("OS");
		p1.setAccount_Type("A");
		p1.setAccount_Status("D");
		p1.setAdmit_Date("1/2/2017");
		p1.setPre_Registration_Status("Hurt");
		p1.setFinancial_Class(18);
		p1.setMRI_Unit_Number(8943);
		p1.setMRI_URN("a123");
		p1.setAPPT_URN("b456");
		p1.setAppt_Sch_Notes("Notes of stuff n things");
		p1.setAppt_Date("1/2/17");
		p1.setDischarge_date("5/2/17");
		
		store(p1);	*/
	}

	private static void store(Patient p1) {
		
		long acctNo = p1.getAccount_Number();
		
		List<Patient> list = db.get(acctNo);
		
		if (list == null) {
			list = new ArrayList<Patient>();
		}
		
		list.add(p1);
		
		db.put(acctNo, list);
	}
	
	static public void main(String str[]) {
		Set<Entry<Long,List<Patient>>> entrySet = DBStore.db.entrySet();
		List<Patient> list = new ArrayList<Patient>();
		
		
		for (Entry<Long, List<Patient>> entry : entrySet) {
			List<Patient> value = entry.getValue();
			list.addAll(value);
		}
		 
	}
}
