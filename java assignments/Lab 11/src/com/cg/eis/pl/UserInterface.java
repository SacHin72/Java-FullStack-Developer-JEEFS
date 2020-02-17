package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.Services;

public class UserInterface {
	EmployeeService obj=new Services();
	
	void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter EmployeeId:");
		 int id=sc.nextInt();
		 System.out.println("Enter Employee Name");
		 String name=sc.next();
		 System.out.println("Enter Employee Salary:");
		 float salary=sc.nextFloat();
		 System.out.println("Enter Designation:");
		 String designation=sc.next(); 
		 Employee obj1=new Employee(id,name,salary,designation);
		 obj.addEmployee(obj1);
	}
	void display()
	{
		
		 System.out.println(obj.AllEmployee());
		
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui=new UserInterface();
		ui.getInput();
		ui.display();
		
		
		
	}

}
