package com.capgemini.healthcaresystem.services;

import java.math.BigInteger;
import java.util.Map;

import com.capgemini.healthcaresystem.dto.Appointment;

public class ValidateCustomerAppointmentId {
	public boolean validateCustomer(Map<BigInteger,Appointment> map,BigInteger appointmentId)
	{
		if(map.get(appointmentId)==null)
		{
			return false;
		}
		else return true;
	}
}
