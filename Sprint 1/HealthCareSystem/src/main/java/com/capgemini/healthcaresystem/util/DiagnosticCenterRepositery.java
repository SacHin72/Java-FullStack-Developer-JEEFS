package com.capgemini.healthcaresystem.util;
import com.capgemini.healthcaresystem.dto.*;
import java.util.*;

public class DiagnosticCenterRepositery {
	static List<DiagnosticCenter> diagnosticCenterList=new ArrayList<DiagnosticCenter>();
	static int id=1000;
	TestRepositery tr=new TestRepositery();
	AppointmentRepository ar=new AppointmentRepository();
	void addCenter()
	{
		diagnosticCenterList.add(new DiagnosticCenter("AIIMS",generateId(),tr.returntestObj(),ar.returnAppointmentObject()));
//		diagnosticCenterList.add(new DiagnosticCenter("Appolo",generateId(),tr.returntestObj(),ar.returnAppointmentObject()));
//		diagnosticCenterList.add(new DiagnosticCenter("Max",generateId(),tr.returntestObj(),ar.returnAppointmentObject()));
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
	public static void main(String[] args)
	{
		DiagnosticCenterRepositery dcr=new DiagnosticCenterRepositery();
		System.out.println(dcr.returnCenterList().size());
//		for(DiagnosticCenter dc:dcr.returnCenterList())
//		{
//			System.out.println(dc.getCenterName());
//			System.out.println(dc.getCenterId());
//			//System.out.println(dc.getAppointmentList());
//			for(Appointment ap:dc.getAppointmentList())
//			{
//				System.out.println(ap.getUser().getEmailId());
//			}
//		}
	}
}
