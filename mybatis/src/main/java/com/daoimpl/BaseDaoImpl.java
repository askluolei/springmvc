package com.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

public class BaseDaoImpl <T> {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate(){
		return sqlSessionTemplate;
	}
	
	public String getClassName(){
		//在父类中得到子类声明的父类的泛型信息  
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz = (Class) pt.getActualTypeArguments()[0];
		//clazz.getSimpleName().toString().toLowerCase(); 这里是获取实体类的简单名称，再把类名转为小写
		return clazz.getSimpleName().toString().toLowerCase();
	}
	
	public void add(T t){
		sqlSessionTemplate.insert(this.getClassName()+".add", t);
	}
	
	public void delete(T t){
		sqlSessionTemplate.delete(this.getClassName()+".delete", t);
	}
	
	public void update(T t){
		sqlSessionTemplate.update(this.getClassName()+".update", t);
	}
	
	public List<T> findAll(){
		return sqlSessionTemplate.selectList(this.getClassName()+".findAll");
	}
	
	public T findById(int id){
		return sqlSessionTemplate.selectOne(this.getClassName()+".findById", id);
	}

}
