package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.model.User;

public interface UserDao {
	
	@Insert("insert into user(username,password) values(#{username},#{password})")
	void add(User user);
	
	@Delete("delete from user where id = #{id}")
	void delete(User user);
	
	@Update("update user set username = #{username},password = #{password} where id = #{id}")
	void update(User user);
	
	@Select("select id,username,password from user")
	@ResultType(User.class)
	List<User> findAll();
	
	@Select("select id,username,password from user where id = #{id}")
	@ResultType(User.class)
	User findById(int id);
	
	@ResultType(User.class)
	@Select("select id,username,password from user where username = #{username}")
	User findByUNM(String username);

}
