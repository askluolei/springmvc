package com.daoimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.User;

@Repository("userDaoImpl2")
public class UserDaoImpl2 implements UserDao {
	
	@Resource
	private HibernateTemplate hibernateTemplate;

	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);
		return true;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(user);
		return true;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(user);
		return true;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list=(List<User>)hibernateTemplate.find("from User");
		return list;
	}

	@Override
	public User findByUNM(String username) {
		// TODO Auto-generated method stub
		List<User> list=(List<User>)hibernateTemplate.find("from User where username = ?", username);
		if(list==null)
			return null;
		else
			return list.get(0);
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return (User)hibernateTemplate.get(User.class, id);
	}

}
