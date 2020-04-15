package com.cg.lab.lab1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
	      ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
	      
	      System.out.println("Employee Details:\n");
	      
	      Employee emp1 = (Employee) context.getBean("employee1");
	      System.out.println("Employee Id : "+emp1.getEmployeeId());
	      System.out.println("Employee Name : "+emp1.getEmployeeName());
	      System.out.println("Employee Salary : "+emp1.getSalary());
	      System.out.println("Employee Business unit : "+emp1.getBusinessUnit());
	      System.out.println("Employee Age : "+emp1.getAge());
	      SBU getDetails = emp1.getSbuDetails();
	      System.out.println("SBU Details:["+"SBU ID : "+getDetails.sbuId+" SBU Name : "+getDetails.sbuName+" SBU Head : "+getDetails.sbuHead+"]");
	      
	      
	      SBU sbu1 = (SBU) context.getBean("sbu2");
	      System.out.println("\n------------------------------------\n");
	      System.out.println("SBU ID : "+sbu1.getSbuId());
	      System.out.println("SBU Name : "+sbu1.getSbuName());
	      System.out.println("SBU Head : "+sbu1.getSbuHead());
	      System.out.println("Employee List : ");
	      List <Employee>list = sbu1.getEmpList();
	      for(Employee emp: list)
	      {
	    	  System.out.println(emp.employeeId);
	      }
	      
	      ((AbstractApplicationContext) context).close();
	   }
}
