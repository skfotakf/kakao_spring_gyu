package com.spring.kakao.model.dto;

public class UserDto {
	private String user_email;
	private String user_password;
	private String user_name;
	private String user_phone;
	
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	@Override
	public String toString() {
		return "UserDto [user_email=" + user_email + ", user_password=" + user_password + ", user_name=" + user_name
				+ ", user_phone=" + user_phone + "]";
	}
	
	
}
