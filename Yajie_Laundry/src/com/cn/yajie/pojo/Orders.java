package com.cn.yajie.pojo;

public class Orders {
    private String oid;

    private String onumber;

    private String uid;

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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
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
}