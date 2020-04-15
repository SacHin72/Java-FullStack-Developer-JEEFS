package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDetails {
	private List<String> names=new ArrayList<>();
 private Map<String, Integer> m=new HashMap<>();
 public EmployeeDetails()
 {
	 names.add("Ravi");
	 names.add("Ramesh");
	 names.add("Mahesh");
	 names.add("Kishan");
	 names.add("Jadav");
	 m.put("Ravi", 65000);
	 m.put("Ramesh", 55000);
	 m.put("Kishan", 45000);
	 m.put("Jadav", 25000);
 }
}
