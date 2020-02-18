package com.capgemini.healthcaresystem.services;
import com.capgemini.healthcaresystem.dao.*;

import java.math.BigInteger;
import java.util.*;
import com.capgemini.healthcaresystem.dto.*;

public class AdminApproveAppointment {										//Class to approve appointment
	boolean value;
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao(); 		//Diagnostic Dao class object
	public boolean approveAppointment(BigInteger bigInt,char ch)										//function to approve or decline Appointment
	{	
		List<DiagnosticCenter> diagnosticCenter=diagnosticCenterDao.centerList();
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
				if(new ValidateAdminAppointment().validateaAdminApprovement(ap))
					value=true;
				else value=false;
		return value;
	}
}