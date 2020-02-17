package com.cpg.lab7.exercise1;

import java.util.*;

public class HashmapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashmapGetValues hashmap=new HashmapGetValues();
	List<Integer> list=hashmap.getValues();
	Collections.sort(list);
	for(int values:list)
	{
		System.out.println(values);
	}
	}

}
