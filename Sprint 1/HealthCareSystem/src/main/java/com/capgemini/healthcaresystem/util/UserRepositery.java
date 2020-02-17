package com.capgemini.healthcaresystem.util;
import java.util.*;

import com.capgemini.healthcaresystem.dto.*;
public class UserRepositery {
	List<User> userList=new ArrayList();
	void addUser()
	{
		userList.add(new User("Sachin kumar","sachin.k.kantiwal@gmail.com","8396825272"));
		userList.add(new User("Ankit kumar","ankitKumar@gmail.com","8396825272"));
		userList.add(new User("Rahul kumar","rahuldandotiya@gmail.com","8396825272"));
	}
	public List<User> userList()
	{
		addUser();
		return userList;
	}
}
