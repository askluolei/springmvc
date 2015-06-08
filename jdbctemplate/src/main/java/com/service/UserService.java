package com.service;

import com.model.User;

public interface UserService {
	boolean login(String username,String password);
	
	boolean update(User user);

}
