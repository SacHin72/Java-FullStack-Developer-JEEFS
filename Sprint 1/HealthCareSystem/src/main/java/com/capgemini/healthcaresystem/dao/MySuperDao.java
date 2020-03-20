package com.capgemini.healthcaresystem.dao;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import com.capgemini.healthcaresystem.dto.Appointment;
import com.capgemini.healthcaresystem.dto.DiagnosticCenter;

public interface MySuperDao {
	public abstract List<DiagnosticCenter> centerList();
	public abstract boolean adminApproveAppointment(BigInteger bigInt,char ch);
	public abstract Map<BigInteger,Appointment> setAppointment();
	public abstract Appointment customerViewAppointmentDao(Map<BigInteger,Appointment> map,BigInteger appointmentId);
}
