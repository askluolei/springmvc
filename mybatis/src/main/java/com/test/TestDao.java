package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.model.User;

public class TestDao {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/demo-*.xml");
		UserDao dao=(UserDao)ctx.getBean("userDaoImpl");
		
//		User user=dao.findById(1);
//		System.out.println(user);
		
//		User user=dao.findByUNM("linxiong");
//		System.out.println(user);
		
//		List<User> list=dao.findAll();
//		for(User u:list)
//			System.out.println(u);
		
//		User user=new User();
//		user.setUsername("kelei");
//		user.setPassword("123456");
//		user.setId(5);
//		dao.delete(user);
	}

}
