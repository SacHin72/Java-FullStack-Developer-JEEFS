package com.cpg.lab7.exercise4;

import java.util.*;

public class Getstudent {
	Map<Integer, String> map1=new HashMap<>();
	Map<Integer,String> getStudent(Map<Integer,Integer> map)
	{
		for(Map.Entry<Integer,Integer> entry: map.entrySet())
		{
			if(entry.getValue()>=90)
			{
				map1.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()<90 && entry.getValue()>=80)
				map1.put(entry.getKey(),"Silver");
			else if(entry.getValue()<80 && entry.getValue()>=70)
				map1.put(entry.getKey(),"Silver");
			else if(entry.getValue()<70)
				map1.put(entry.getKey(),"Not Eligible");
		}
		return map1;
	}
}
