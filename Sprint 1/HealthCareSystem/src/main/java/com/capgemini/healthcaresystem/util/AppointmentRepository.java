package com.capgemini.healthcaresystem.util;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;

import com.capgemini.healthcaresystem.dto.*;

public class AppointmentRepository {
	List<Appointment> list=new ArrayList<Appointment>();
	static BigInteger b=BigInteger.valueOf(1000);
	BigInteger b1=BigInteger.valueOf(1);
	TestRepositery tr=new TestRepositery();
	UserRepositery ur=new UserRepositery();
	List<User> userList1=ur.userList();
	List<Test> testList=tr.returntestObj();
	
	void addAppointment()
	{
		Iterator<User> iterator=userList1.iterator();
		
		for(Test t:testList)
		{
			if(iterator.hasNext())
			{
				list.add(new Appointment(iterator.next(),generateId(),t,LocalDateTime.now(),true));
			}
			else break;
		}

	}
	public BigInteger generateId()
	{
		return b=b.add(b1);
	}
	public List<Appointment> returnAppointmentObject()
	{
		addAppointment();
		
		return list;
	}
	public static void main(String[] args)
	{
		AppointmentRepository ar=new AppointmentRepository();
		System.out.println(ar.returnAppointmentObject().size());
		System.out.println(ar.returnAppointmentObject());
//		for(Appointment ap1:ar.returnAppointmentObject())
//		{
//			System.out.println(ap1.getAppointmentId());
//			System.out.println(ap1.getDatetime());
//			System.out.println(ap1.isApproved());
//			System.out.println(ap1.getTest().getTestId());
//			System.out.println(ap1.getUser().getEmailId());
//		}
	}
}
