package com.cpg.fancyshop;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter number of products:");
		int number=sc.nextInt();
		
		Shop shop=new Shop();
		while(number-->0)
		{
		System.out.println("enter product id and product name:");
		int id=sc.nextInt();
		String s=sc1.nextLine();
		shop.addProductDetails(id, s);
		}
		System.out.println("Enter string element");
		String ele=sc1.nextLine();
		System.out.println(shop.searchBasedOnProduct(ele));
		sc.close();
		sc1.close();
	}

}
