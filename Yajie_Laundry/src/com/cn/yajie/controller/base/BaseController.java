package com.cn.yajie.controller.base;

import javax.annotation.Resource;

import com.cn.yajie.service.IAdminService;
import com.cn.yajie.service.ICompanyService;
import com.cn.yajie.service.IUserService;

public class BaseController {
	@Resource
	protected IUserService userService;
	
	@Resource
	protected IAdminService adminService;
	
	@Resource
	protected ICompanyService companyService;
}
