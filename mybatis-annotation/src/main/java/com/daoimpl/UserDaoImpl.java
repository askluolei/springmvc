package com.daoimpl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.getMapper(UserDao.class).add(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.getMapper(UserDao.class).delete(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.getMapper(UserDao.class).update(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.getMapper(UserDao.class).findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.getMapper(UserDao.class).findById(id);
	}

	@Override
	public User findByUNM(String username) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.getMapper(UserDao.class).findByUNM(username);
	}

}
