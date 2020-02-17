package com.cpg.lab6.exercise7;

import java.io.File;
import java.util.StringTokenizer;

public class FileHandling {
	public static String extension(String value)
	{
		StringTokenizer arr = new StringTokenizer(value,"."); 
		arr.nextToken();
		return arr.nextToken();
	}
	
	public static void main(String ar[])
	{
		File f=new File("hel.java");
          System.out.println(" file name :"+f.getName());
          System.out.println("path:"+f.getAbsolutePath());
          System.out.println("exists:"+f.exists());
          System.out.println("is file:"+f.isFile());
          System.out.println("is dir:"+f.isDirectory());
          System.out.println("read :"+f.canRead());
          System.out.println("write:"+f.canWrite());
          System.out.println("length:"+f.length());
          System.out.println("Extension: ."+extension(f.getName()));
          
          
          
	}

}
