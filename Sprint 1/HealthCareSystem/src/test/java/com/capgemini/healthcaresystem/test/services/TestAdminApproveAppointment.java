package com.capgemini.healthcaresystem.test.services;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import com.capgemini.healthcaresystem.services.*;
public class TestAdminApproveAppointment {
	
	@Test
	public void approveAppointment()
	{
		BigInteger big1=BigInteger.valueOf(1001);
	BigInteger big2=BigInteger.valueOf(1002);
	AdminApproveAppointment adminApproveAppointment=new AdminApproveAppointment();
	assertEquals(true,adminApproveAppointment.approveAppointment(big1,'y'));
	assertEquals(false,adminApproveAppointment.approveAppointment(big2,'n'));
	}
}
