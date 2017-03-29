package com.cn.yajie.pojo;

public class User {
    private String uid;

    private String username;

    private String password;

    private String umobile;

    private String utelphone;

    private String umobileBak;

    private String uhomeaddr;

    private String companyid;

    private String companyname;

    private String ucompanyaddr;

    private String adddate;

    private String remark;

    
    
    public User() {
		super();
	}

	public User(String uid, String username, String password, String umobile, String utelphone, String umobileBak,
			String uhomeaddr, String companyid, String companyname, String ucompanyaddr, String adddate,
			String remark) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.umobile = umobile;
		this.utelphone = utelphone;
		this.umobileBak = umobileBak;
		this.uhomeaddr = uhomeaddr;
		this.companyid = companyid;
		this.companyname = companyname;
		this.ucompanyaddr = ucompanyaddr;
		this.adddate = adddate;
		this.remark = remark;
	}

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

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
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

	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", umobile=" + umobile
				+ ", utelphone=" + utelphone + ", umobileBak=" + umobileBak + ", uhomeaddr=" + uhomeaddr
				+ ", companyid=" + companyid + ", companyname=" + companyname + ", ucompanyaddr=" + ucompanyaddr
				+ ", adddate=" + adddate + ", remark=" + remark + "]";
	}
    
    
}