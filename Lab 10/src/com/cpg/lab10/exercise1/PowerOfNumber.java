package com.cpg.lab10.exercise1;

import java.util.*;
interface Power{
	double powerOfNum(double num1,double num2);
}
class PowerOfNum{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double num1=sc.nextInt();
	double num2=sc.nextInt();
	Power p=(x,y)->Math.pow(x,y);
			
			
	System.out.println(p.powerOfNum(num1,num2));
	sc.close();
	}
}