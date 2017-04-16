package com.cn.yajie.pojo;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -6563625635443010248L;

	private String uid;

    private String username;

    private String password;

    private String umobile;

    private String utelphone;

    private String umobileBak;

    private String uhomeaddr;

    private Company company;

    private String companyname;

    private String ucompanyaddr;

    private String adddate;

    private String remark;

    
	public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }


    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile == null ? null : umobile.trim();
    }

    public String getUtelphone() {
        return utelphone;
    }

    public void setUtelphone(String utelphone) {
        this.utelphone = utelphone == null ? null : utelphone.trim();
    }

    public String getUmobileBak() {
        return umobileBak;
    }

    public void setUmobileBak(String umobileBak) {
        this.umobileBak = umobileBak == null ? null : umobileBak.trim();
    }

    public String getUhomeaddr() {
        return uhomeaddr;
    }

    public void setUhomeaddr(String uhomeaddr) {
        this.uhomeaddr = uhomeaddr == null ? null : uhomeaddr.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getUcompanyaddr() {
        return ucompanyaddr;
    }

    public void setUcompanyaddr(String ucompanyaddr) {
        this.ucompanyaddr = ucompanyaddr == null ? null : ucompanyaddr.trim();
    }

    public String getAdddate() {
        return adddate;
    }

    public void setAdddate(String adddate) {
        this.adddate = adddate == null ? null : adddate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
    
    
}