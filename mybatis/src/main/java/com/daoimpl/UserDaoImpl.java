package com.daoimpl;


import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	@Override
	public User findByUNM(String username) {
		// TODO Auto-generated method stub
		return getSqlSessionTemplate().selectOne(getClassName()+".findByUNM", username);
	}

}
