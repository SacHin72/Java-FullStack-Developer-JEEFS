package com.cpg.lab7.exercise5;

import java.util.Scanner;

public class GetSecondSmallestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		GetSecondSmallest gs=new GetSecondSmallest();
		System.out.println("enter the size of array:");
		
		int size=sc.nextInt();
		System.out.println("enter the elements of array:");
		int arr[]=new int[size];
		for(int index=0;index<size;index++)
		{
			arr[index]=sc.nextInt();
		}
		System.out.println(gs.getSecondSmallest(arr));
		sc.close();
	}

}
