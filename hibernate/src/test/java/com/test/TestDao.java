package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

public class TestDao {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/demo-*.xml");
//		UserDao dao=(UserDao)ctx.getBean("userDaoImpl1");
		UserService service=(UserService)ctx.getBean("userServiceImpl");
//		User user=dao.getById(3);
//		System.out.println(user);
		
//		List<User> list=dao.findAll();
//		for(User u:list)
//			System.out.println(u);
		
//		User us=dao.findByUNM("luolei");
//		System.out.println(us);
		
		User u=new User();
		u.setId(4);
		u.setUsername("doubing12");
		u.setPassword("666666");
		System.out.println(service.update(u));
	}

}
