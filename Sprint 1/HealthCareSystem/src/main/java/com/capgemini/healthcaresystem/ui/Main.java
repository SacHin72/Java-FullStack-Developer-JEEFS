package com.capgemini.healthcaresystem.ui;										//importing all packages
import com.capgemini.healthcaresystem.exception.*;
import java.math.BigInteger;
import java.util.*;
import com.capgemini.healthcaresystem.dto.*;
import com.capgemini.healthcaresystem.services.*;
import com.capgemini.healthcaresystem.dao.*;
public class Main {

	public void mainFunction()
	{
		CustomerViewAppointment cva=new CustomerViewAppointment();				//Object of View Appointment class
		AdminApproveAppointment aap=new AdminApproveAppointment();				//Object of Admin approve appointment class
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter 1 for Admin For Approve Appointmnet!");	//print out statements
			System.out.println("Enter 2 for User for see Application Status!");
			int choice=sc.nextInt();											//Input choice from User
			if(choice==1)
			{
				aap.approveAppointment();										//Calling approve appointment function
			}
			else if(choice==2)
			{
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter your Appointmnet Id:");
				BigInteger b=sc1.nextBigInteger();														
				Map<BigInteger,Appointment> map=cva.setAppointment();		
				cva.customerViewAppointment(map,b);								//Calling customer view Appointment status function
			}
			else 
			{ 
				System.out.println("wrong choice!!!");
			}
			throw new MyException("Unchecked Exception caught");			//throwing User defined Exception
		}
		catch(NullPointerException e)											//handling null pointer Exception
		{
			e.getMessage();
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
			mainFunction();
		}
		sc.close();
		
	}
	public static void main(String[] args) {									//Main function
		// TODO Auto-generated method stub
		Main main=new Main();
		
		main.mainFunction();
	}
}
