package com.cpg.lab9.test;
import java.util.*;
class Reverse
{
	public static String reverse(String str)
	{
		List<Character> list = new ArrayList<Character>();
		for (char c : str.toCharArray())
		  list.add(c);
		Collections.reverse(list);
		StringBuilder builder = new StringBuilder(list.size());
		for (Character c : list)
			builder.append(c);
		return builder.toString();
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str =sc.nextLine();
		str = reverse(str);
		System.out.println("Reversed string is:" + str);
		sc.close();
	}
}

