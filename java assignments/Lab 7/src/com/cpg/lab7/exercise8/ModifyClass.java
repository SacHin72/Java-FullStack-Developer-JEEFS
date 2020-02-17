package com.cpg.lab7.exercise8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ModifyClass {
	public static int[] getSquarenumber(int[] intArray)
	{
		int intindex,value = 1,length1;
		int intWithoutDuplicate[];
		int len=0;
		HashMap<Integer,Integer> intCount=new LinkedHashMap<>();
		for(intindex=0;intindex<intArray.length;intindex++)
		{
			
				if(intCount.containsKey((intArray[intindex])))
				{
					value=intCount.get(intArray[intindex]);
			       intCount.put(intArray[intindex],value+1);
				}
				else
				{
					 intCount.put(intArray[intindex],value);
				}
			
		}
		length1=intCount.size();
		intWithoutDuplicate=new int[length1];
		for(Entry<Integer, Integer> entry:intCount.entrySet())
		{
			intWithoutDuplicate[len]=entry.getKey();
			len++;
			//System.out.println(entry.getKey()+" " +entry.getValue());
		}
		return intWithoutDuplicate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {1,2,2,3,4,5,6,1,2,3,4,5};
		int intSquare[]=getSquarenumber(intArray);
		for(int i=0;i<intSquare.length;i++)
		{
			System.out.println(intSquare[i]);
		}
		
	}

}
