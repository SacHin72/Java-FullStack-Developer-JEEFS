package com.cpg.practice;

import java.util.*;

public class FindIndex {
	public boolean xyzThere(String s)
	{
		if(s.contains(".xyz"))
		{
			return false;
		}
		else return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr String");
		String s1=sc.nextLine();FindIndex fi=new FindIndex();
		System.out.println(fi.xyzThere(s1));
	}
}
