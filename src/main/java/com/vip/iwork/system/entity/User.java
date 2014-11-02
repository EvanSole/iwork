package com.vip.iwork.system.entity;

import java.util.Date;

public class User {

	private Long usesId;

	private String userName;

	private String email;

	private String password;

	private Date registerDate;

	private Date lastLoginDate;

	public Long getUsesId() {
		return usesId;
	}

	public void setUsesId(Long usesId) {
		this.usesId = usesId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

}
