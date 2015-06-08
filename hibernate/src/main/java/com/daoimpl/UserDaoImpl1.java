package com.daoimpl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.User;

//@Repository("userDaoImpl1")
public class UserDaoImpl1 implements UserDao {
	
	@Resource
	private SessionFactory sessionFactory;
		
	

	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(user);
		return true;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
//		session.getTransaction().begin();
		session.delete(user);
//		session.getTransaction().commit();
		return true;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
//		session.getTransaction().begin();
		session.update(user);
//		session.getTransaction().commit();
		return true;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list=sessionFactory.openSession().createQuery("from User").list();
		return list;
	}

	@Override
	public User findByUNM(String username) {
		// TODO Auto-generated method stub
		List<User> list=sessionFactory.openSession().createQuery("from User where username = '"+username+"'").list();
		if(list!=null)
			return list.get(0);
		return null;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.openSession().get(User.class, id);
	}

}
