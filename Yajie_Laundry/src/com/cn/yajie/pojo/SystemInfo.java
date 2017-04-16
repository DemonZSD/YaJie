package com.cn.yajie.pojo;

import java.io.Serializable;

public class SystemInfo implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String id;

    private String systemname;

    private String contactname;

    private String contacttel;

    private String contactmobile1;

    private String contactmobile2;

    private String address;

    private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSystemname() {
		return systemname;
	}

	public void setSystemname(String systemname) {
		this.systemname = systemname;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getContacttel() {
		return contacttel;
	}

	public void setContacttel(String contacttel) {
		this.contacttel = contacttel;
	}

	public String getContactmobile1() {
		return contactmobile1;
	}

	public void setContactmobile1(String contactmobile1) {
		this.contactmobile1 = contactmobile1;
	}

	public String getContactmobile2() {
		return contactmobile2;
	}

	public void setContactmobile2(String contactmobile2) {
		this.contactmobile2 = contactmobile2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "SystemInfo [id=" + id + ", systemname=" + systemname + ", contactname=" + contactname + ", contacttel="
				+ contacttel + ", contactmobile1=" + contactmobile1 + ", contactmobile2=" + contactmobile2
				+ ", address=" + address + ", remark=" + remark + "]";
	}
    
    
    
}
