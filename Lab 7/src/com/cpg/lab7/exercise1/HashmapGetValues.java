package com.cpg.lab7.exercise1;

import java.util.*;

public class HashmapGetValues {
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	List<Integer> getValues()
	{
		System.out.println("Enter number of key value pair:");
		int number=sc1.nextInt();
		for(int index=0;index<number;index++)
		{
			System.out.println("Enter key and value:");
			String str=sc.nextLine();
			int value=sc1.nextInt();
			map.put(str, value);
		}
		
			Collection<Integer> values=map.values();
			List<Integer> list=new ArrayList<Integer>(values);
			return list;
	}

}
