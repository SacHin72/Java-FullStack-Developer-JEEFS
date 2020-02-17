package com.cpg.lab5.Exercise3;

import java.util.Scanner;

public class PrimeNUmberMain {
	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt(); 
	    PrimeNumber obj=new  PrimeNumber();
	    obj.printPrime(n); 
	    sc.close();
	} 
	} 