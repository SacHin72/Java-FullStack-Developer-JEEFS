package com.capgemini.healthcaresystem.ui;										//importing all packages
import java.math.BigInteger;
import java.util.*;
import com.capgemini.healthcaresystem.dto.*;
import com.capgemini.healthcaresystem.services.*;
import com.capgemini.healthcaresystem.dao.*;
import com.capgemini.healthcaresystem.exception.*;
public class Main {

	public void mainFunction() throws MyException
	{
		CustomerViewAppointment cva=new CustomerViewAppointment();				//Object of View Appointment class
		AdminApproveAppointment aap=new AdminApproveAppointment();				//Object of Admin approve appointment class
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter 1 for Admin For Approve Appointmnet!");	//print out statements
			System.out.println("Enter 2 for User for see Application Status!");
			System.out.println("Enter 3 for Exit!");
			int choice=sc.nextInt();											//Input choice from User
			if(choice==1)
			{	
				try {
						Scanner sc2=new Scanner(System.in);
						System.out.println("Enter Appointment id And Y/N");
						BigInteger bigint=sc.nextBigInteger();
						char ch=sc2.next().charAt(0);
						boolean value=aap.approveAppointment(bigint,ch);										//Calling approve appointment function
						if(value)
						{
							System.out.println("Appointment approved");
							mainFunction();
						}
						else
						{
							System.out.println("Appointment Declined");
							mainFunction();
						}
					}
				catch(MyException e)
				{
					e.getMessage();
				}
			}
			else if(choice==2)
			{
				try
				{
					Scanner sc1=new Scanner(System.in);
					System.out.println("Enter your Appointmnet Id:");
					BigInteger b=sc1.nextBigInteger();														
					Map<BigInteger,Appointment> map=cva.setAppointment();		
					Appointment appointment=cva.customerViewAppointment(map,b);								//Calling customer view Appointment status function
					if(appointment!=null)
					{
						System.out.println("Appointment id is:"+appointment.getAppointmentId());
						System.out.println("Name:"+appointment.getUser().getUserName());
						System.out.println("Email id:"+appointment.getUser().getEmailId());
						System.out.println("Contact Number:"+appointment.getUser().getContactNo());
						System.out.println("Test Id is:"+appointment.getTest().getTestId());
						System.out.println("Test name is:"+appointment.getTest().getTestName());
						System.out.println("Date is:"+appointment.getDatetime());
						if(appointment.isApproved()==true)
							System.out.println("Appointment Status: APPROVED");
						else
							System.out.println("Appointment Status: DENIED");
						mainFunction();
					}
					else
					{
						
						throw new MyException("Id not found Exception");
					}
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
					mainFunction();
				}
			}
			else if(choice==3)
			{ 
				System.out.println("DONE!!!");
				return ;
			}
			else 
			{
				throw new MyException("wrong choice!! Exception");
			}
	}
	
	public static void main(String[] args) throws MyException {									//Main function
		Main main=new Main();
		main.mainFunction();
		

	}
}
