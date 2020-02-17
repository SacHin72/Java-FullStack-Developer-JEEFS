package com.capgemini.healthcaresystem.services;
import com.capgemini.healthcaresystem.dao.*;
import java.util.*;
import com.capgemini.healthcaresystem.ui.*;
import com.capgemini.healthcaresystem.dto.*;
public class AdminApproveAppointment {										//Class to approve appointment
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao(); 		//Dao class object
	public void approveAppointment()										//function to approve or decline Appointment
	{	
		List<DiagnosticCenter> diagnosticCenter=diagnosticCenterDao.centerList();
		Main mainObject=new Main();
		List<Appointment> appointmentList=new ArrayList<Appointment>();		//list to store all appointment object
		for(DiagnosticCenter dc:diagnosticCenter)
		{
			appointmentList.addAll(dc.getAppointmentList());
		}
		for(DiagnosticCenter dc:diagnosticCenter)
		{
			Scanner sc=new Scanner(System.in);
			for(Appointment ap:dc.getAppointmentList())
			{	
				
				System.out.println("Diagnostic Center Name:"+ dc.getCenterName());
				System.out.println("Diagnostic Center Id:"+dc.getCenterId());
				System.out.println("Appointment id:"+ap.getAppointmentId());
				System.out.println("Appointmnet date And time:"+ap.getDatetime());
				System.out.println("Test id:"+ap.getTest().getTestId());
				System.out.println("Test Name:"+ap.getTest().getTestName());
				System.out.println("Type Y/N for approve appointment And Type M for Main page:");
				char input=sc.next().charAt(0);
				if(input=='y'|| input=='Y')
				{
					System.out.println("Your Have approved a Appointment");									
					ap.setApproved(true);
				}
				else if(input=='n'||input=='N')
				{
					System.out.println("you have declined a Appointment");
					ap.setApproved(false);
				}
				else if(input=='m'||input=='M')
				{
					mainObject.mainFunction();
				}
				else System.out.println("Wrong Choice!!");
			}
			sc.close();
			mainObject.mainFunction();
		}
	}
}
