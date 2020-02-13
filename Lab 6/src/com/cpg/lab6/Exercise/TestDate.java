package com.cpg.lab6.Exercise;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date();
		Date date2=new Date(9999999999L);
		Date date3=new Date(99999999999L);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		if(date1.after(date2)) {
			System.out.println("Our first date is after second date");
		}
		if(date2.before(date3)) {
			System.out.println("Our second date is before third date");
		}
	}

}
