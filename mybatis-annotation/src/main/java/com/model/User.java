package com.model;

public class User {
	private int id;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer("{\"id\":\"").append(id)
				.append("\",\"username\":\"").append(username)
				.append("\",\"password\":\"").append(password).append("\"}")
				.toString();
	}
	
	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setUsername("luolei");
		user.setPassword("666666");
		System.out.println(user);
	}

}
