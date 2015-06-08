package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.UserDao;
import com.daoimpl.UserDaoImpl;
import com.model.User;
import com.service.UserService;
import com.serviceimpl.UserServiceImpl;

public class TestDao {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/config/demo-*.xml");
		UserDao dao=(UserDao)ctx.getBean("userDaoImpl");
//		UserService service=(UserService)ctx.getBean("userServiceImpl");
		User user=new User();
		user.setId(3);
		user.setUsername("linxiong2");
		user.setPassword("123456");
		System.out.println(dao.update(user));
//		
//		dao.save(user);
		
//		List<User> list=dao.findAll();
//		for(User u:list){
//			System.out.println(u.getId()+" "+u.getUsername()+" "+u.getPassword());
//		}
		
//		User u=dao.findByUNM("luolei");
//		if(u!=null)
//			System.out.println(u.getId()+" "+u.getUsername()+" "+u.getPassword());
		
//		User u=dao.getById(2);
//		if(u!=null)
//			System.out.println(u.getId()+" "+u.getUsername()+" "+u.getPassword());
		
//		User u=new User();
//		u.setId(2);
//		System.out.println(dao.delete(u));
		
//		for(int i=0;i<10;i++){
//			new Thread(new Runnable(){
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					UserDao dao=(UserDao)ctx.getBean(UserDaoImpl.class);
//					User us=dao.getById(2);
//					System.out.println(us);
//				}
//			}).start();
//		}
	}

}
