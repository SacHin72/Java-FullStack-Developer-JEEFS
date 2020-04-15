package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao {
 public Map<String,String> users=new HashMap<String, String>();
 public UserDaoImpl() {
	 users.put("Ramesh", "abcd");
	 users.put("Amit", "xyz");
	 users.put("mahesh", "jkl");
 }
	@Override
	public String addUser(String uname, String pass) {
		// TODO Auto-generated method stub
		users.put(uname, pass);
		return "Users Created" +uname;
	}

	@Override
	public String removeUser(String uname) {
		// TODO Auto-generated method stub
		users.remove(uname);
		return "User Remove";
	}

	@Override
	public String getPassword(String uname) {
		// TODO Auto-generated method stub
		if(users.containsKey(uname))
		return users.get(uname);
		else
			return null;
	}
	@Override
	public Map<String, String> getAllUser() {
		// TODO Auto-generated method stub
		return users;
	}
		
}
