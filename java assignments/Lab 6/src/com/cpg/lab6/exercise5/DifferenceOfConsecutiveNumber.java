package com.cpg.lab6.exercise5;

public class DifferenceOfConsecutiveNumber {
	
	public int modifyNumber(int n) {
		char[] arr = (""+ n).toCharArray();
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=(char) (arr[i]-arr[i+1]);
		}
		
		n = Integer.parseInt(new String(arr));
		return n;
}}
