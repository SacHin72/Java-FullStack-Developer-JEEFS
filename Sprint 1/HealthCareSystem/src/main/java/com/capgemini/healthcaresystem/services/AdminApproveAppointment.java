package com.capgemini.healthcaresystem.services;
import com.capgemini.healthcaresystem.dao.*;
import com.capgemini.healthcaresystem.dto.Appointment;

import java.math.BigInteger;
import java.util.Map;

public class AdminApproveAppointment implements MySuperService {										//Class to approve appointment

	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao(); 		//Diagnostic Dao class object
	public boolean approveAppointment(BigInteger bigInt,char ch)										//function to approve or decline Appointment
	{	
		return diagnosticCenterDao.adminApproveAppointment(bigInt, ch);
		
	}
	public Appointment customerViewAppointment(Map<BigInteger, Appointment> map, BigInteger appointmentId) {
		return null;
	}
}