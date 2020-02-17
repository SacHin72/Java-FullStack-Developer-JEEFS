package com.cpg.discount;

import java.util.*;

public class Discount {
	String name;
	int price;
	float discount;
	void productDiscount(String []s)
	{
		Map<String,Integer> map1=new HashMap<>();
		Map<Integer,String> map2=new TreeMap<>();
		for(int i=0;i<s.length;i++)
		{
			
			String str[]=s[i].split(",");
			//map1.put(str[0],Integer.parseInt(str[1]));
			int dis=(Integer.parseInt(str[1])*Integer.parseInt(str[2]))/100;
			map2.put(dis,str[0]);
			
		}
//		ArrayList<Integer> keyList = new ArrayList<Integer>(map2.keySet());
//		int s1=0;
//		for(Integer a:keyList)
//		{
//			if(a==map2.)
//		}
		
		for(Map.Entry<Integer, String> entry:map2.entrySet())
		{
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
			break;
		}
		
	}

}
