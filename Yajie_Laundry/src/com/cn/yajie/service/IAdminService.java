package com.cn.yajie.service;


import com.cn.yajie.pojo.Admin;

public interface IAdminService {
	
	/**
	 * 管理员登录
	 * @param loginname
	 * @param password
	 * @return
	 */
	Admin login(String loginname,String password);
	
	
	/**
	 * 根据登录名 获取Admin
	 * @param loginname
	 * @return
	 */
	Admin getByLoginname(String loginname);
}
