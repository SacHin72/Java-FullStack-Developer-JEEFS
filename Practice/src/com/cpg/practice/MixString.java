package com.cpg.practice;

import java.util.*;

public class MixString {
	StringBuilder mixString(String s1,String s2)
	{
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				sb.append(ch1[i]);
				sb.append(ch2[i]);
			}
		}
		else if(s1.length()>s2.length())
		{
			for(int i=0;i<s2.length();i++)
			{
				sb.append(ch1[i]);
				sb.append(ch2[i]);
			}
			for(int i=s2.length();i<s1.length();i++)
			{
				sb.append(ch1[i]);
			}
		}
		else if(s1.length()<s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				sb.append(ch1[i]);
				sb.append(ch2[i]);
			}
			for(int i=s1.length();i<s2.length();i++)
			{
				sb.append(ch2[i]);
			}
		}
		return sb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MixString ms=new MixString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr two Strings:");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(ms.mixString(s1, s2));
		sc.close();
	}

}
