package com.airticketbooking.user.dto;

public class User {
	private String userName;
	private String email;
	private String phone;
	private String password;
	
	public User(String userName, String email, String phone2, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.phone = phone2;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", phone=" + phone + ", password=" + password + "]";
	}
	
	
	
}
