package com.service;

import com.model.User;

public interface UserService {
	
	boolean countLogin(String username,String password);
	
	void update(User user);

}
