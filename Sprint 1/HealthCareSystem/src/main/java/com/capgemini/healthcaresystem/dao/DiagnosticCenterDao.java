package com.capgemini.healthcaresystem.dao;
import java.util.List;
import com.capgemini.healthcaresystem.dto.*;
import com.capgemini.healthcaresystem.util.*;						//Importing all packages
public class DiagnosticCenterDao {
	TestRepositery tr=new TestRepositery();							//Test repository object
	DiagnosticCenterRepositery dcr=new DiagnosticCenterRepositery();//Diagnostic center repository object
	AppointmentRepository ar=new AppointmentRepository();
	public List<Test> testList()
	{
		return tr.returntestObj();
	}
	public List<DiagnosticCenter> centerList()						//Sending list of Diagnostic center to service Package
	{
		return dcr.returnCenterList();
	}
	public List<Appointment> AppointmentObjectList()
	{
		return ar.returnAppointmentObject();
	}
}
