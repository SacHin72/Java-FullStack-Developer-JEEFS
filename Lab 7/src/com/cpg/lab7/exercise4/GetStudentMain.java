package com.cpg.lab7.exercise4;

import java.util.*;

public class GetStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Reg. No and Marks:");
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap<>();
		for(int index=0;index<5;index++)
		map.put(sc.nextInt(),sc.nextInt());
		Getstudent gs=new Getstudent();
		Map<Integer,String> map1=gs.getStudent(map);
		System.out.print(map1);
		sc.close();
	}

}
