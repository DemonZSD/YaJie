package com.cn.yajie.pojo;

import java.io.Serializable;

public class Admin implements Serializable{
	private static final long serialVersionUID = -7395657366630631657L;
	private String id;
	private String loginname;
	private String password;
	private String mobile;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", loginname=" + loginname + ", password=" + password + ", mobile=" + mobile
				+ ", name=" + name + "]";
	}
	
}
