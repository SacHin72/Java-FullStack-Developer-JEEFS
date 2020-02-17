package com.cpg.lab7.exercise3;

import java.util.*;

public class GetSquare {
	Map<Integer,Integer> getSquare(int[] arr)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int num:arr)
		{
			map.put(num,num*num);
		}
		return map;
	}
}
