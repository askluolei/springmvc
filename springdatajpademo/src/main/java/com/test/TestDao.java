package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.model.User;

public class TestDao {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/demo-*.xml");
		UserDao userDao=(UserDao)ctx.getBean("userDao");
//		User user=userDao.findByUsername("luolei");
//		System.out.println(user);
		
		User user=new User();
		user.setId(6);
		user.setUsername("kelei");
		user.setPassword("123456");
		userDao.delete(user);
	}

}
