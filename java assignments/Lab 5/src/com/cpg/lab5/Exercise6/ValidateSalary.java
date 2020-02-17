package com.cpg.lab5.Exercise6;

import java.util.Scanner;

class MyException extends Exception
	{
	private static final long serialVersionUID = -2578389036929593335L;

		MyException(String s)
		{
			super(s);
		}
}
public class ValidateSalary{

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int salary=sc.nextInt();
			sc.close();
			try {
				if(salary<3000)
					throw new MyException("Salary is less than 3000!!!!");
				else	
					System.out.println("Valid salary");
			}
			catch(MyException e)
			{
				System.out.println(e.getMessage());
			}	
		}
	}