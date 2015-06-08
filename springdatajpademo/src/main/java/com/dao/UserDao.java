package com.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository("userDao")
public interface UserDao extends CrudRepository<User, Integer> {
	
	User findByUsername(String username);

}
