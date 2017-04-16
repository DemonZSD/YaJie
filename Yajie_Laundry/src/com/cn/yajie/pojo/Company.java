package com.cn.yajie.pojo;

import java.io.Serializable;

public class Company implements Serializable{
	private static final long serialVersionUID = -6902787019514700571L;

	private String cid;

    private String caddr;

    private String cname;

    private String cchargeperson;

    private String cchargepersonmobile;

    private String cchargepersontel;

    private String remark;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCaddr() {
        return caddr;
    }

    public void setCaddr(String caddr) {
        this.caddr = caddr == null ? null : caddr.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCchargeperson() {
        return cchargeperson;
    }

    public void setCchargeperson(String cchargeperson) {
        this.cchargeperson = cchargeperson == null ? null : cchargeperson.trim();
    }

    public String getCchargepersonmobile() {
        return cchargepersonmobile;
    }

    public void setCchargepersonmobile(String cchargepersonmobile) {
        this.cchargepersonmobile = cchargepersonmobile == null ? null : cchargepersonmobile.trim();
    }

    public String getCchargepersontel() {
        return cchargepersontel;
    }

    public void setCchargepersontel(String cchargepersontel) {
        this.cchargepersontel = cchargepersontel == null ? null : cchargepersontel.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}