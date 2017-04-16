package com.cn.yajie.pojo;

import java.io.Serializable;

public class Orders implements Serializable{
	private static final long serialVersionUID = -6662004596427940912L;

	private String oid;

    private String onumber;

    private User user;

    private String uname;

    private String umobile;

    private String odate;

    private String takedate;

    private String washmode;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber == null ? null : onumber.trim();
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile == null ? null : umobile.trim();
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate == null ? null : odate.trim();
    }

    public String getTakedate() {
        return takedate;
    }

    public void setTakedate(String takedate) {
        this.takedate = takedate == null ? null : takedate.trim();
    }

    public String getWashmode() {
        return washmode;
    }

    public void setWashmode(String washmode) {
        this.washmode = washmode == null ? null : washmode.trim();
    }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
    
}