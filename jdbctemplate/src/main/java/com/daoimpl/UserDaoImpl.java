package com.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		boolean flog = false;
		int i = jdbcTemplate.update(
				"insert into user(username,password) values(?,?)",
				user.getUsername(), user.getPassword());
		if (i > 0)
			flog = true;
		return flog;
	}

	@Override
	public boolean delete(User user) {
		// TODO Auto-generated method stub
		boolean flog = false;
		int i = jdbcTemplate.update("delete from user where id = ?",
				user.getId());
		if (i > 0)
			flog = true;
		return flog;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		boolean flog = false;
		int i = jdbcTemplate.update(
				"update user set username = ?,password = ? where id = ?",
				user.getUsername(), user.getPassword(), user.getId());
		if (i > 0)
			flog = true;
		return flog;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list = (List<User>) jdbcTemplate.query(
				"select id,username,password from user", new RowMapper() {
					@Override
					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						// TODO Auto-generated method stub
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("username"));
						user.setPassword(rs.getString("password"));
						return user;
					}
				});

		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public User findByUNM(String username) {
		// TODO Auto-generated method stub
		User user = null;
		user = (User) jdbcTemplate.queryForObject(
				"select id,username,password from user where username = ?",
				new Object[] { username }, new RowMapper() {
					@Override
					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						// TODO Auto-generated method stub
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("username"));
						user.setPassword(rs.getString("password"));
						return user;
					}
				});
		return user;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		User user = null;
		user = (User) jdbcTemplate.queryForObject(
				"select id,username,password from user where id = ?",
				new Object[] { id }, new RowMapper() {
					@Override
					public Object mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						// TODO Auto-generated method stub
						User user = new User();
						user.setId(rs.getInt("id"));
						user.setUsername(rs.getString("username"));
						user.setPassword(rs.getString("password"));
						return user;
					}
				});
		return user;
	}

}
