package com.coderscampus.week13.domain;

public class User {
	private String userName;
	private String passwsord;
	private String name;
	
	public User (String userName, String password, String name) {
		this.userName = userName;
		this.passwsord = password;
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswsord() {
		return passwsord;
	}

	public void setPasswsord(String passwsord) {
		this.passwsord = passwsord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passwsord=" + passwsord + ", name=" + name + "]";
	}
	
}
