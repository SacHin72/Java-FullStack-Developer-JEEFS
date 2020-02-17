package com.capgemini.healthcaresystem.services;
import com.capgemini.healthcaresystem.exception.*;
import java.math.BigInteger;
import java.util.*;

import com.capgemini.healthcaresystem.dao.DiagnosticCenterDao;
import com.capgemini.healthcaresystem.dto.*;

public class CustomerViewAppointment {
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();
	public Map<BigInteger,Appointment> setAppointment()//Function to find appointment
	{
		List<DiagnosticCenter> diagnosticCenter=diagnosticCenterDao.centerList();
		List<Appointment> appointmentList=new ArrayList<Appointment>();
		Map<BigInteger,Appointment> map=new HashMap<BigInteger, Appointment>();
			for(DiagnosticCenter dc:diagnosticCenter)
			{
				appointmentList.addAll(dc.getAppointmentList());
			}
		for(Appointment appointment:appointmentList)
		{
			map.put(appointment.getAppointmentId(),appointment);
		}
		return map;																		  //return AppointmentId and Appointment object in map
	}
	public void customerViewAppointment(Map<BigInteger,Appointment> map,BigInteger appointmentId)//Function to view the appointment status
	{		//Main mainObject=new Main();															  
			Appointment appointment=map.get(appointmentId);								  //fetching Appointment object from map.
			System.out.println("Appointment id is:"+appointment.getAppointmentId());
			System.out.println("Name:"+appointment.getUser().getUserName());
			System.out.println("Email id:"+appointment.getUser().getEmailId());
			System.out.println("Contact Number:"+appointment.getUser().getContactNo());
			System.out.println("Test Id is:"+appointment.getTest().getTestId());
			System.out.println("Test name is:"+appointment.getTest().getTestName());
			System.out.println("Date is:"+appointment.getDatetime());
			if(appointment.isApproved()==true)
				System.out.println("Appointment Status: APPROVED");
			else
				System.out.println("Appointment Status: DENIED");
			//mainObject.mainFunction();
	}
}
