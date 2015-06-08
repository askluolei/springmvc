package com.service;

import com.model.User;

public interface UserService {
	
	boolean count(String username,String password);
	
	void update(User user);

}
