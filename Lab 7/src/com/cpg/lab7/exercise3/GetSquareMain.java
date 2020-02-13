package com.cpg.lab7.exercise3;

import java.util.*;
public class GetSquareMain {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[5];
	System.out.println("Enter the five array element");
	for(int index=0;index<5;index++)
	{
		arr[index]=sc.nextInt();
	}
	GetSquare gs=new GetSquare();
	Map<Integer,Integer> map=gs.getSquare(arr);
	System.out.print(map);
	sc.close();
}
}
