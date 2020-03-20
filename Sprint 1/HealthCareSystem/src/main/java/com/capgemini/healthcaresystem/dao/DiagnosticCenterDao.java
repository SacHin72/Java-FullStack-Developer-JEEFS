package com.capgemini.healthcaresystem.dao;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capgemini.healthcaresystem.dto.*;
import com.capgemini.healthcaresystem.util.*;						//Importing all packages
public class DiagnosticCenterDao implements MySuperDao{

	static DiagnosticCenterRepositery diagnosticCenterRepositery=new DiagnosticCenterRepositery();//Diagnostic center repository object
	
	public List<DiagnosticCenter> centerList()						//Sending list of Diagnostic center to service Package
	{
		return diagnosticCenterRepositery.returnCenterList();
	}
	public boolean adminApproveAppointment(BigInteger bigInt,char ch)//function to approve or decline Appointment
	{	
		List<DiagnosticCenter> diagnosticCenter=new DiagnosticCenterDao().centerList();
		Map<BigInteger,Appointment> map=new HashMap<BigInteger, Appointment>();
		List<Appointment> appointmentList=new ArrayList<Appointment>();		//list to store all appointment object
		
		for(DiagnosticCenter dc:diagnosticCenter)
		{
			appointmentList.addAll(dc.getAppointmentList());
		}
		for(Appointment appointment:appointmentList)
		{
			map.put(appointment.getAppointmentId(),appointment);
		}
		Appointment ap=map.get(bigInt);
				if(ch=='y'||ch=='Y')
				{
					ap.setApproved(true);
					
				}
				else if(ch=='n'||ch=='N')
				{
					ap.setApproved(false);
					
				}
				return ((new ValidateDao().validateaAdminApprovement(ap))?true:false);
	}
	
	//function for show status of appointment
	
	public Map<BigInteger,Appointment> setAppointment()									//Function to make appointment id ,appointmentObject map
	{
		List<DiagnosticCenter> diagnosticCenter=new DiagnosticCenterDao().centerList();
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
		return map;																	  //return AppointmentId and Appointment object in map
	}
	
	public Appointment customerViewAppointmentDao(Map<BigInteger,Appointment> map,BigInteger appointmentId)//Function to view the appointment status
	{																	  
			
		if(new ValidateDao().validateCustomer(map, appointmentId))
			return map.get(appointmentId);
		else
			return null;

	}
	
	
}
