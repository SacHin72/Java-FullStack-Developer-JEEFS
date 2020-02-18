package com.capgemini.healthcaresystem.services;
import java.math.BigInteger;
import java.util.*;

import com.capgemini.healthcaresystem.dao.DiagnosticCenterDao;
import com.capgemini.healthcaresystem.dto.*;

public class CustomerViewAppointment {
	
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();
	public Map<BigInteger,Appointment> setAppointment()									//Function to find appointment
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
		return map;																	  //return AppointmentId and Appointment object in map
	}
	
	public Appointment customerViewAppointment(Map<BigInteger,Appointment> map,BigInteger appointmentId)//Function to view the appointment status
	{																	  
			
		if(new ValidateCustomerAppointmentId().validateCustomer(map, appointmentId))
			return map.get(appointmentId);
		else
			return null;

	}
}
