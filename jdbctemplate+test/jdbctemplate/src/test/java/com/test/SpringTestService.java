package com.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
import com.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo-common.xml")
@Transactional
public class SpringTestService {
	
	@Resource
	private UserService userService;
	
	@Test
	public void testUpdate(){
		User user=new User();
		user.setId(5);
		user.setUsername("dou");
		user.setPassword("666666");
		userService.update(user);
	}
	
	@Test
	public void testLogin(){
		userService.login("luolei", "666666");
	}

}
