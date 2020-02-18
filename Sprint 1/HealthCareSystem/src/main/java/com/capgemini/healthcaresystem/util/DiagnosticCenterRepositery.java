package com.capgemini.healthcaresystem.util;
import com.capgemini.healthcaresystem.dto.*;
import java.util.*;

public class DiagnosticCenterRepositery {
	List<DiagnosticCenter> diagnosticCenterList=new ArrayList<DiagnosticCenter>();
	static int id=1000;
	TestRepositery testRepositery=new TestRepositery();
	AppointmentRepository appointmentRepositey=new AppointmentRepository();
	void addCenter()
	{
		diagnosticCenterList.add(new DiagnosticCenter("AIIMS",generateId(),testRepositery.returntestObj(),appointmentRepositey.returnAppointmentObject()));
		diagnosticCenterList.add(new DiagnosticCenter("Appolo",generateId(),testRepositery.returntestObj(),appointmentRepositey.returnAppointmentObject()));
		diagnosticCenterList.add(new DiagnosticCenter("Max",generateId(),testRepositery.returntestObj(),appointmentRepositey.returnAppointmentObject()));
	}
	String generateId()
	{
		id+=1;
		return String.valueOf(id);
	}
	public List<DiagnosticCenter> returnCenterList()
	{
		addCenter();
		return diagnosticCenterList;
	}
}
