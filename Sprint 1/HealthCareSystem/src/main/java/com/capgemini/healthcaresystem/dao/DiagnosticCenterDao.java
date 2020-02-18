package com.capgemini.healthcaresystem.dao;
import java.util.List;
import com.capgemini.healthcaresystem.dto.*;
import com.capgemini.healthcaresystem.util.*;						//Importing all packages
public class DiagnosticCenterDao {

	DiagnosticCenterRepositery diagnosticCenterRepositery=new DiagnosticCenterRepositery();//Diagnostic center repository object

	public List<DiagnosticCenter> centerList()						//Sending list of Diagnostic center to service Package
	{
		return diagnosticCenterRepositery.returnCenterList();
	}

}
