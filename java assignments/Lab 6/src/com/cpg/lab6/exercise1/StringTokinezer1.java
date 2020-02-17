package com.cpg.lab6.exercise1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokinezer1 {

	
	public static  void  Tokinezer(String  lineIntegral)
	{
		 int sum=0;
		int val=0;
		System.out.println(lineIntegral);
		StringTokenizer arr = new StringTokenizer(lineIntegral," "); 
		while(arr.hasMoreTokens())
		{
			
			val=Integer.parseInt(arr.nextToken());
			System.out.println(val);
			sum+=val;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String ar[])
	{
		String lineIntegral;
		Scanner sc=new Scanner(System.in);
		lineIntegral=sc.nextLine();
		Tokinezer(lineIntegral);
		sc.close();
	}

}
