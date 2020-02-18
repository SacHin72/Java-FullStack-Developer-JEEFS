package com.capgemini.healthcaresystem.test.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import com.capgemini.healthcaresystem.services.*;
public class TestCustomerViewAppointment {
	
	@Test
	public void customerViewAppointment()
	{
	BigInteger big1=BigInteger.valueOf(1001);
	BigInteger big2=BigInteger.valueOf(1002);
	CustomerViewAppointment customerViewAppointment1=new CustomerViewAppointment();
	
	assertEquals(big1,(customerViewAppointment1.customerViewAppointment(customerViewAppointment1.setAppointment(),big1)).getAppointmentId());
	assertEquals(big2,(customerViewAppointment1.customerViewAppointment(customerViewAppointment1.setAppointment(),big2)).getAppointmentId());
	assertEquals(true,(customerViewAppointment1.customerViewAppointment(customerViewAppointment1.setAppointment(),big1)).isApproved());
	assertEquals("101",(customerViewAppointment1.customerViewAppointment(customerViewAppointment1.setAppointment(),big1)).getTest().getTestId());

	}
}
