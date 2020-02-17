package com.cpg.lab5.Exercise4;
import java.util.Scanner;

class MyException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7025862126696880253L;

	public MyException(String s)
	{
		super(s);
	}
	
}

public class ValidateName {
	public static void main(String args[])
	{
	String firstname,lastname;
	Scanner sc=new Scanner(System.in);
		firstname=sc.nextLine();
		lastname=sc.nextLine();
		sc.close();
		try {
			if(firstname.isEmpty())
			throw new MyException("Firstname cannot be empty");
		}
		catch(MyException e)
		{
			System.out.println("Caught firstname");
			System.out.println(e.getMessage());
		}
		try {
			if(lastname.isEmpty())
			throw new MyException("Lastname cannot be empty");
		}
		catch(MyException e)
		{
			System.out.println("Caught Lastname");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println(firstname+" "+lastname);
		}
	}
	

}
