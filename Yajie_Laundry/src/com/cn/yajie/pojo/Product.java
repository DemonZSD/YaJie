package com.cn.yajie.pojo;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = -1609753591077643269L;

	private String pid;

    private String pname;

    private Washclass washclass;

    private String wname;

    private User user;

    private String uname;

    private Orders orders;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }


    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

	public Washclass getWashclass() {
		return washclass;
	}

	public void setWashclass(Washclass washclass) {
		this.washclass = washclass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
    
    
}