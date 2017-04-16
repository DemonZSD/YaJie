package com.cn.yajie.pojo;

import java.io.Serializable;

public class Washclass implements Serializable{
	
	private static final long serialVersionUID = 3371573920647942865L;

	private String wid;

    private String wtype;

    private String wname;

    private String wparendid;

    private String washmode;

    private String remark;

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    public String getWtype() {
        return wtype;
    }

    public void setWtype(String wtype) {
        this.wtype = wtype == null ? null : wtype.trim();
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname == null ? null : wname.trim();
    }

    public String getWparendid() {
        return wparendid;
    }

    public void setWparendid(String wparendid) {
        this.wparendid = wparendid == null ? null : wparendid.trim();
    }

    public String getWashmode() {
        return washmode;
    }

    public void setWashmode(String washmode) {
        this.washmode = washmode == null ? null : washmode.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}