package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.service.UserService;

public class TestService {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/demo-*.xml");
		UserService service=(UserService)ctx.getBean("userServiceImpl");
		User user=new User();
		user.setId(5);
		user.setUsername("doubing");
		user.setPassword("666666");
		service.update(user);
	}

}
