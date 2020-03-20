package com.capgemini.healthcaresystem.dao;

import java.math.BigInteger;
import java.util.Map;

import com.capgemini.healthcaresystem.dto.Appointment;

public class ValidateDao {
	public boolean validateaAdminApprovement(Appointment appointment)
	{
		if(appointment.isApproved())
			return true;
		else
			return false;
	}
	public boolean validateCustomer(Map<BigInteger,Appointment> map,BigInteger appointmentId)
	{
		if(map.get(appointmentId)==null)
		{
			return false;
		}
		else return true;
	}
}
