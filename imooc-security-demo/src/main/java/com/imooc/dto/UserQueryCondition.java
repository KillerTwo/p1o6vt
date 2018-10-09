package com.imooc.dto;

public class UserQueryCondition {
	private String username;
	private int age;
	private int sex;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "UserQueryCondition [username=" + username + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
