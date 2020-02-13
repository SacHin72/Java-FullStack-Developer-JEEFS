package com.cpg.lab7.exercise2;

import java.util.*;

public class CountCharacterMain {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	CountCharacter cc=new CountCharacter();
	char[] ch=sc.next().toCharArray();
	Map<Character,Integer> map=cc.countCharacter(ch);
	sc.close();
	System.out.print(map);
}
}
