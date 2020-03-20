package com.capgemini.healthcaresystem.services;

import java.math.BigInteger;
import java.util.Map;

import com.capgemini.healthcaresystem.dto.Appointment;

public interface MySuperService {
	public Appointment customerViewAppointment(Map<BigInteger,Appointment> map,BigInteger appointmentId);
	public boolean approveAppointment(BigInteger bigInt,char ch);
}
