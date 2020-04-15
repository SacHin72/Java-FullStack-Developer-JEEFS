package com.cg.lab.lab1;

public class Employee {
	
	int employeeId;
	String employeeName;
	double salary;
	String businessUnit;
	int age;
	SBU sbuDetails;
	
	public Employee() {}
	
	public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age, SBU sbuDetails) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
		this.sbuDetails = sbuDetails;
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public SBU getSbuDetails() {
		return sbuDetails;
	}

	public void setSbuDetails(SBU sbuDetails) {
		this.sbuDetails = sbuDetails;
	}
	
}
