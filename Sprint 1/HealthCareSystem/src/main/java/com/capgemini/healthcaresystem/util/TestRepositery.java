package com.capgemini.healthcaresystem.util;
import java.util.*;

import com.capgemini.healthcaresystem.dto.*;
public class TestRepositery {
	public static List<DiagnosticTest> testList=new ArrayList();
	static void testAdd()
	{
	testList.add(new DiagnosticTest("101","Fever"));
	testList.add(new DiagnosticTest("102","Maleria"));
	testList.add(new DiagnosticTest("103","Corona Virus"));
	}

	public List<DiagnosticTest> returntestObj()
	{
		testAdd();
		return testList;
	}
}
