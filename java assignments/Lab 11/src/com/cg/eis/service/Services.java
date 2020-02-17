package com.cg.eis.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cg.eis.bean.Employee;

;
public class Services implements EmployeeService {
	
	List<Employee> list=new ArrayList<Employee>();

	@Override
	public void addEmployee(Employee e) {
		list.add(e);	
	}

	@Override
	public Set<Employee> AllEmployee() {
	        Set<Employee> employeeDetail=new HashSet<>(list);
	        return employeeDetail;	}

	@Override
	public String scheme(float salary, String designation) {
		
		
		return null;
	}


}
