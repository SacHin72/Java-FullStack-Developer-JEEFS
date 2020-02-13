package com.cpg.kab2.Exercise1;

import java.util.Scanner;

public abstract class WrittenItem extends Item {
	private String author;

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	Scanner sc=new Scanner(System.in);
	

	public WrittenItem() {
		
		super();
		System.out.println("enter author:");
		setAuthor(sc.next());
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(int idno, int copies_count, String title,String author) {
		super(idno, copies_count, title);
		setAuthor(author);
		// TODO Auto-generated constructor stub
	}
	public void print()
	{
		super.print();
		System.out.println("author is:"+getAuthor());
	}

}
