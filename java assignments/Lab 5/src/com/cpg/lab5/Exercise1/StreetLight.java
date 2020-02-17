package com.cpg.lab5.Exercise1;

import java.util.Scanner;

public class StreetLight {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Any Below Option:");
		System.out.println("1.Red  2.Green 3.Yellow");
		int choice=sc.nextInt();
		sc.close();
		switch(choice)
		{
		case 1: 
			System.out.println("Stop!");
			break;
		case 2: 
			System.out.println("Go!");
			break;
		case 3: 
			System.out.println("Ready!");
			break;
		}
		}
	}

