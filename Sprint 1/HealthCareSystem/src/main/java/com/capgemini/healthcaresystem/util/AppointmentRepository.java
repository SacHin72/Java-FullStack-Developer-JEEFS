package com.capgemini.healthcaresystem.util;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;

import com.capgemini.healthcaresystem.dto.*;

public class AppointmentRepository {
	List<Appointment> list=new ArrayList<Appointment>();
	BigInteger bigInteger=BigInteger.valueOf(1000);
	BigInteger bigInteger1=BigInteger.valueOf(1);
	TestRepositery testRepositery=new TestRepositery();
	UserRepositery userRepositery=new UserRepositery();
	List<User> userList1=userRepositery.userList();
	List<DiagnosticTest> testList=testRepositery.returntestObj();
	
	void addAppointment()
	{
		Iterator<User> iterator=userList1.iterator();
		
		for(DiagnosticTest testlist:testList)
		{
			if(iterator.hasNext())
			{
				list.add(new Appointment(iterator.next(),generateId(),testlist,LocalDateTime.now(),true));
			}
			//else break;
		}

	}
	public BigInteger generateId()
	{
		return bigInteger=bigInteger.add(bigInteger1);
	}
	public List<Appointment> returnAppointmentObject()
	{
		addAppointment();
		
		return list;
	}
}
