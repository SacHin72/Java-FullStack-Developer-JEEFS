package com;

public class Employee {
	private int empid;
	private String name;
	private Address address;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printEmployee()
	{
		System.out.println("Employee ID :"+empid);
		System.out.println("Employee Name :"+empid);
		System.out.println("Employee city :"+address.getCity());
		System.out.println("Employee country :"+address.getCountry());
	
		
	}

}
