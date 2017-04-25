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

    private String uhomeAddr;

    private Company company;

    private String companyName;
    private String companyId;
    
    private String ucompanyAddr;

    private String addDate;

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

	public String getUhomeAddr() {
		return uhomeAddr;
	}

	public void setUhomeAddr(String uhomeAddr) {
		this.uhomeAddr = uhomeAddr;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getUcompanyAddr() {
		return ucompanyAddr;
	}

	public void setUcompanyAddr(String ucompanyAddr) {
		this.ucompanyAddr = ucompanyAddr;
	}

	public String getAddDate() {
		return addDate;
	}

	public void setAddDate(String addDate) {
		this.addDate = addDate;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
    
    
}