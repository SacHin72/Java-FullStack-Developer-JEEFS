package com.cpg.lab7.exercise2;
import java.util.*;
public class CountCharacter {
	Map<Character,Integer> map=new HashMap<>();
	
	Map countCharacter(char[] arr)
	{
		for(char ch:arr)
		{
			if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
				map.put(ch,1);
		}
		return map;
	}
}
