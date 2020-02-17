package com.capgemini.healthcaresystem.util;
import java.util.*;

import com.capgemini.healthcaresystem.dto.*;
public class TestRepositery {
	public static List<Test> testList=new ArrayList();
	static void testAdd()
	{
	testList.add(new Test("101","Fever"));
	testList.add(new Test("102","Maleria"));
	testList.add(new Test("103","Corona Virus"));
	}

	public List<Test> returntestObj()
	{
		testAdd();
		return testList;
	}
//	public static void main(String[] args)
//	{
//		TestRepositery tr=new TestRepositery();
//		for(Test t:tr.returntestObj())
//		{
//			System.out.println(t.getTestId());
//			System.out.println(t.getTestName());
//		}
//	}
}
