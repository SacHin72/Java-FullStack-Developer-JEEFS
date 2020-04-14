package com.cg.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.UserDao;
@Service
public class UserService {
	@Autowired
	UserDao udao;
	public String addUser(String uname,String pass)
	{
		if(uname.length() <3 || pass.length()<4)
			return "Invalid data";
			else
				return udao.addUser(uname, pass);
		
	}
	public String removeUser(String uname)
	{
		if(uname.length()>=3)
		{
			return udao.removeUser(uname);
		}
		else
		{
			return "Invalid user";
		}
	}
	
	public Map<String,String> getAllUser()
	{
	return udao.getAllUser();
}
}
