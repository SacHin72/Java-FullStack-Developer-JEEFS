package com.cpg.bean;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		Call call=new Call();
		call.parseData(s);
		sc.hasNextLine();
		long calledNumber=sc.nextLong();
		CallHistory ch=new CallHistory();
		ch.addCall(call);
		System.out.println(ch.findTotalDuration(calledNumber));
		sc.close();
	}

}
