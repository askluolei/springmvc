package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.service.UserService;

public class TestService {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/demo-*.xml");
		UserService service=(UserService)ctx.getBean("userServiceImpl");
		
//		System.out.println(service.countLogin("luolei", "6666"));
		
		User user=new User();
		user.setId(4);
		user.setUsername("dou");
		user.setPassword("123");
		service.update(user);
	}

}
