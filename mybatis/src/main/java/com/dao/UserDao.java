package com.dao;

import com.model.User;

public interface UserDao extends BaseDao<User> {
	
	User findByUNM(String username);

}
