package com.cpg.lab5.Exercise2;

import java.util.Scanner;

public class FibonacciSeriesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fibb=new FibonacciSeries();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sequence number:");
		int number=sc.nextInt();
		for(int index=0;index<=number;index++)
		{
			System.out.print(fibb.usingRecursion(index)+" ");
		}
		sc.close();
	}

}
