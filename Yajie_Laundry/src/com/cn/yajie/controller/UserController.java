package com.cn.yajie.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.yajie.controller.base.BaseController;

@Controller  
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@RequestMapping("/userlist")
	public String userList() throws Exception{
		
		return "userManager/userlist";
	}
}
