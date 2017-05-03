package com.parallon.codefest.ptac.model;

import java.util.Date;

public class Patient {
	
	long ID;
	String Facility;
	long Unit;
	String Facility_Mnemonic;
	String Account_Mnemonic;
	long Account_Number;
	String Patient_Name;
	String DOB;
	String Patient_Address;
	long Home_Phone;
	String Patient_Employer;
	String ICD_10_DX_Code;
	String Schedule_Date;
	String Schedule_Time;
	String Book_date;
	String Preop_date;
	String Location;
	String Admit_MD;
	long Admitting_MD_Phone;
	String Physician_Address;
	String Physician_NPI;
	String Reason_For_Visit;
	long CPT;
	String Patient_Type;
	String Account_Type;
	String Account_Status;
	String Admit_Date;
	String Pre_Registration_Status;
	long Financial_Class;
	long MRI_Unit_Number;
	String MRI_URN;
	String APPT_URN;
	String Appt_Sch_Notes;
	String Appt_Date;
	String Discharge_date;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFacility() {
		return Facility;
	}
	public void setFacility(String facility) {
		Facility = facility;
	}
	public long getUnit() {
		return Unit;
	}
	public void setUnit(long unit) {
		Unit = unit;
	}
	public String getFacility_Mnemonic() {
		return Facility_Mnemonic;
	}
	public void setFacility_Mnemonic(String facility_Mnemonic) {
		Facility_Mnemonic = facility_Mnemonic;
	}
	public String getAccount_Mnemonic() {
		return Account_Mnemonic;
	}
	public void setAccount_Mnemonic(String account_Mnemonic) {
		Account_Mnemonic = account_Mnemonic;
	}
	public long getAccount_Number() {
		return Account_Number;
	}
	public void setAccount_Number(long account_Number) {
		Account_Number = account_Number;
	}
	public String getPatient_Name() {
		return Patient_Name;
	}
	public void setPatient_Name(String patient_Name) {
		Patient_Name = patient_Name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPatient_Address() {
		return Patient_Address;
	}
	public void setPatient_Address(String patient_Address) {
		Patient_Address = patient_Address;
	}
	public long getHome_Phone() {
		return Home_Phone;
	}
	public void setHome_Phone(long home_Phone) {
		Home_Phone = home_Phone;
	}
	public String getPatient_Employer() {
		return Patient_Employer;
	}
	public void setPatient_Employer(String patient_Employer) {
		Patient_Employer = patient_Employer;
	}
	public String getICD_10_DX_Code() {
		return ICD_10_DX_Code;
	}
	public void setICD_10_DX_Code(String iCD_10_DX_Code) {
		ICD_10_DX_Code = iCD_10_DX_Code;
	}
	public String getSchedule_Date() {
		return Schedule_Date;
	}
	public void setSchedule_Date(String schedule_Date) {
		Schedule_Date = schedule_Date;
	}
	public String getSchedule_Time() {
		return Schedule_Time;
	}
	public void setSchedule_Time(String schedule_Time) {
		Schedule_Time = schedule_Time;
	}
	public String getBook_date() {
		return Book_date;
	}
	public void setBook_date(String book_date) {
		Book_date = book_date;
	}
	public String getPreop_date() {
		return Preop_date;
	}
	public void setPreop_date(String preop_date) {
		Preop_date = preop_date;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getAdmit_MD() {
		return Admit_MD;
	}
	public void setAdmit_MD(String admit_MD) {
		Admit_MD = admit_MD;
	}
	public long getAdmitting_MD_Phone() {
		return Admitting_MD_Phone;
	}
	public void setAdmitting_MD_Phone(long admitting_MD_Phone) {
		Admitting_MD_Phone = admitting_MD_Phone;
	}
	public String getPhysician_Address() {
		return Physician_Address;
	}
	public void setPhysician_Address(String physician_Address) {
		Physician_Address = physician_Address;
	}
	public String getPhysician_NPI() {
		return Physician_NPI;
	}
	public void setPhysician_NPI(String physician_NPI) {
		Physician_NPI = physician_NPI;
	}
	public String getReason_For_Visit() {
		return Reason_For_Visit;
	}
	public void setReason_For_Visit(String reason_For_Visit) {
		Reason_For_Visit = reason_For_Visit;
	}
	public long getCPT() {
		return CPT;
	}
	public void setCPT(long cPT) {
		CPT = cPT;
	}
	public String getPatient_Type() {
		return Patient_Type;
	}
	public void setPatient_Type(String patient_Type) {
		Patient_Type = patient_Type;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getAccount_Status() {
		return Account_Status;
	}
	public void setAccount_Status(String account_Status) {
		Account_Status = account_Status;
	}
	public String getAdmit_Date() {
		return Admit_Date;
	}
	public void setAdmit_Date(String admit_Date) {
		Admit_Date = admit_Date;
	}
	public String getPre_Registration_Status() {
		return Pre_Registration_Status;
	}
	public void setPre_Registration_Status(String pre_Registration_Status) {
		Pre_Registration_Status = pre_Registration_Status;
	}
	public long getFinancial_Class() {
		return Financial_Class;
	}
	public void setFinancial_Class(long financial_Class) {
		Financial_Class = financial_Class;
	}
	public long getMRI_Unit_Number() {
		return MRI_Unit_Number;
	}
	public void setMRI_Unit_Number(long mRI_Unit_Number) {
		MRI_Unit_Number = mRI_Unit_Number;
	}
	public String getMRI_URN() {
		return MRI_URN;
	}
	public void setMRI_URN(String mRI_URN) {
		MRI_URN = mRI_URN;
	}
	public String getAPPT_URN() {
		return APPT_URN;
	}
	public void setAPPT_URN(String aPPT_URN) {
		APPT_URN = aPPT_URN;
	}
	public String getAppt_Sch_Notes() {
		return Appt_Sch_Notes;
	}
	public void setAppt_Sch_Notes(String appt_Sch_Notes) {
		Appt_Sch_Notes = appt_Sch_Notes;
	}
	public String getAppt_Date() {
		return Appt_Date;
	}
	public void setAppt_Date(String appt_Date) {
		Appt_Date = appt_Date;
	}
	public String getDischarge_date() {
		return Discharge_date;
	}
	public void setDischarge_date(String discharge_date) {
		Discharge_date = discharge_date;
	}



	
	
}
