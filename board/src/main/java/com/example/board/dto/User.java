package com.example.board.dto;

public class User {
	private String user_id;
	private String user_password;
	private String email;
	private String birthday;
	private String sex;
	
	public User() {
		
	}
	
	public User(String user_id, String user_password, String email, String birthday, String sex) {
		super();
		this.user_id = user_id;
		this.user_password = user_password;
		this.email = email;
		this.birthday = birthday;
		this.sex = sex;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
	
}
