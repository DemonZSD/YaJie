package com.cn.yajie.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cn.yajie.dao.IAdminDao;
import com.cn.yajie.pojo.Admin;
import com.cn.yajie.service.IAdminService;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("adminService")
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private IAdminDao adminDao;
	
	public Admin login(String loginname, String password) {
		
		return adminDao.checkAdmin(loginname, password);
	}

	public Admin getByLoginname(String loginname) {
		return adminDao.getByLoginname(loginname);
		
	}
}
