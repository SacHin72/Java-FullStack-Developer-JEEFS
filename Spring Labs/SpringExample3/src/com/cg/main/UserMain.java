package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.UserService;

public class UserMain {

	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		UserService us=(UserService) ctx.getBean("userService");
		System.out.println(us.addUser("Vishal", "iopk"));
		System.out.println(us.getAllUser());
		
	}
}
