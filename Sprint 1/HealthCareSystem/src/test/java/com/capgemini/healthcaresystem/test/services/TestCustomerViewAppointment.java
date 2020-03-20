package com.capgemini.healthcaresystem.test.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import java.time.LocalDateTime;

import com.capgemini.healthcaresystem.dao.DiagnosticCenterDao;
import com.capgemini.healthcaresystem.services.*;
public class TestCustomerViewAppointment {
	
	@Test
	public void customerViewAppointment()
	{
	BigInteger big1=BigInteger.valueOf(1001);
	BigInteger big2=BigInteger.valueOf(1002);
	BigInteger big3=BigInteger.valueOf(1050);
	CustomerViewAppointment customerViewAppointment1=new CustomerViewAppointment();
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();
	assertEquals(big1,(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big1)).getAppointmentId());
	assertEquals(big2,(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big2)).getAppointmentId());
	assertEquals(true,(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big1)).isApproved());
	assertEquals("101",(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big1)).getTest().getTestId());
	
	}
	@Test
	public void customerViewAppointment1()
	{
	BigInteger big1=BigInteger.valueOf(1001);
	BigInteger big2=BigInteger.valueOf(1002);
	
	CustomerViewAppointment customerViewAppointment1=new CustomerViewAppointment();
	DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();
	assertEquals("ankitKumar@gmail.com",(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big2)).getUser().getEmailId());
	assertEquals("9811197175",(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big2)).getUser().getContactNo());
	assertEquals("Ankit kumar",(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big2)).getUser().getUserName());
	assertEquals("Maleria",(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big2)).getTest().getTestName());
	assertEquals("Fever",(customerViewAppointment1.customerViewAppointment(diagnosticCenterDao.setAppointment(),big1)).getTest().getTestName());
	
	
	}
}
