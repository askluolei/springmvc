package com.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:demo-common.xml")
@Transactional
public class SpringTestDao {
	
	@Resource
	private UserDao userDao;
	
	@Test
	public void testSave(){
		User user=new User();
		user.setUsername("linxiong");
		user.setPassword("666666");
		userDao.save(user);
	}
	
	@Test
	public void testDelete(){
		User user=new User();
		user.setId(5);
		userDao.delete(user);
	}
	
	@Test
	public void testUpdate(){
		User user=new User();
		user.setId(5);
		user.setUsername("dou");
		user.setPassword("222");
		userDao.update(user);
	}
	
	@Test
	public void testFindAll(){
		userDao.findAll();
	}
	
	@Test
	public void testFindByUNM(){
		String username="luolei";
		userDao.findByUNM(username);
	}
	
	@Test
	public void testGetById(){
		userDao.getById(5);
	}
	

}
