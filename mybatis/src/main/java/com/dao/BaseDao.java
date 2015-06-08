package com.dao;

import java.util.List;

public interface BaseDao <T>{
	
	void add(T t);
	
	void delete(T t);
	
	void update(T t);
	
	List<T> findAll();
	
	T findById(int id);
	
}
