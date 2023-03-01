package com.airticketbooking.admin.dto;

public class Admin {
	private String aUsername;
	private String aPassword;
	
	public Admin(String aUsername, String aPassword) {
		super();
		this.aUsername = aUsername;
		this.aPassword = aPassword;
	}
	public String getaUsername() {
		return aUsername;
	}
	public void setaUsername(String aUsername) {
		this.aUsername = aUsername;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	@Override
	public String toString() {
		return "Admin [aUsername=" + aUsername + ", aPassword=" + aPassword + "]";
	}
	
	
	
}
