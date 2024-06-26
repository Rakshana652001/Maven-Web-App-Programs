package com.chainsys.MavenWebApp.model;

public class User 
{
	String name;
	String emailId;
	String password;
	long phoneNumber;
	
	
	public User() 
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", emailId=" + emailId + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ "]";
	}
}
