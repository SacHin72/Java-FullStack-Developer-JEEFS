package com.capgemini.healthcaresystem.dto;

import java.util.*;

public class DiagnosticCenter {
	private String centerName;
	private String centerId;
	private List<DiagnosticTest> ListOfTests=new ArrayList();
	private List<Appointment> appointmentList=new ArrayList();

	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}

	public DiagnosticCenter(String centerName, String centerId, List<DiagnosticTest> listOfTests,
			List<Appointment> appointmentList) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
		this.ListOfTests = listOfTests;
		this.appointmentList = appointmentList;
	}
	
}
