package com.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;
import com.service.UserService;

@Service("userServiceImpl")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	@Transactional(readOnly=true)
	public boolean count(String username, String password) {
		// TODO Auto-generated method stub
		User user=userDao.findByUsername(username);
		if(user==null)
			return false;
		else{
			if(password.equals(user.getPassword()))
				return true;
		}
		return false;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);

	}

}
