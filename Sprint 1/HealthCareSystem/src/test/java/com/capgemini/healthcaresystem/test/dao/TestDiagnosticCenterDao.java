package com.capgemini.healthcaresystem.test.dao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.capgemini.healthcaresystem.dao.*;
import java.math.BigInteger;
public class TestDiagnosticCenterDao {
	@Test
	void diagnosticCenterDao()
	{
		BigInteger biginteger=BigInteger.valueOf(1001);
		BigInteger biginteger1=BigInteger.valueOf(1002);
		DiagnosticCenterDao diagnosticCenterDao=new DiagnosticCenterDao();

		assertEquals(biginteger,diagnosticCenterDao.centerList().get(0).getAppointmentList().get(0).getAppointmentId());
		assertEquals(biginteger1,diagnosticCenterDao.centerList().get(1).getAppointmentList().get(1).getAppointmentId());
		
	}
}
