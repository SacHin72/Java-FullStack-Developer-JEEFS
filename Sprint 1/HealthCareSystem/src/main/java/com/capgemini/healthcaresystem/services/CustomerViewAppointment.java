package com.capgemini.healthcaresystem.services;
import java.math.BigInteger;
import java.util.*;

import com.capgemini.healthcaresystem.dao.DiagnosticCenterDao;
import com.capgemini.healthcaresystem.dto.*;

public class CustomerViewAppointment implements MySuperService{
	
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();

	public Appointment customerViewAppointment(Map<BigInteger,Appointment> map,BigInteger appointmentId)//Function to view the appointment status
	{																	  
		//DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();
		return diagnosticCenterDao.customerViewAppointmentDao(map, appointmentId);

	}

	public boolean approveAppointment(BigInteger bigInt, char ch) {
		// TODO Auto-generated method stub
		return false;
	}
}
