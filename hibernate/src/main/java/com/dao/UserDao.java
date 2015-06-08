package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {
	
	boolean save(User user);
	
	boolean delete(User user);
	
	boolean update(User user);
	
	List<User> findAll();
	
	User findByUNM(String username);
	
	User getById(int id);
	
}
