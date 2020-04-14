package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value="dept")
public class Department {
	@Value("${did}")
	private String did;
	@Value("${dname}")
	private String dname;
	@Value("${dsize}")
	private int depSize;
	@Autowired
	private Employee emp;
	
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getDepSize() {
		return depSize;
	}
	public void setDepSize(int depSize) {
		this.depSize = depSize;
	}
	
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public void printDepartment()
	{
		System.out.println("Department Id :"+did);
		System.out.println("Department Name :"+dname);
		System.out.println("Department size :"+depSize);
		System.out.println("Employee Name :"+emp.getName());
		System.out.println("Employee  id :"+emp.getEmpid());
		System.out.println("Employee salary :"+emp.getSalary());
		System.out.println("Empployee grade :"+emp.getGrade());
	}

}
