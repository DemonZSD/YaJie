package com.cn.yajie.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.cn.yajie.controller.base.BaseController;
import com.cn.yajie.pojo.User;
import com.cn.yajie.util.common.ConvertUtil;
import com.cn.yajie.util.common.PageModel;

import test.TestMyBatis;

@Controller  
@RequestMapping("/user")
public class UserController extends BaseController{
	private static Logger logger = Logger.getLogger(UserController.class);
	
	/**
	 * 定向与用户列表页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userlist")
	public String user() throws Exception{
		return "user/userlist";
	}
	
	/**
	 * 用户列表 json数据
	 * @param pageIndex
	 * @param user
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/userajaxlist")
	public JSONObject userList(HttpServletRequest request) throws Exception{
		String search = request.getParameter("search[value]");
		int pageSize = ConvertUtil.String2Int(request.getParameter("length"));
		int firstLimitParam = ConvertUtil.String2Int(request.getParameter("start"));
		//分页查询用户
		User user = new User();
		if(search!=null && !("").equals(search)){
			user.setUsername(search);
			user.setUmobile(search);
		}
		PageModel pageModel = new PageModel();
		pageModel.setPageSize(pageSize);
		pageModel.setFirstLimitParam(firstLimitParam);
		List<User> users = userService.findUser(user, pageModel);
		logger.info("pageModel------->"+pageModel.toString());
		
		JSONObject jsonObj=new JSONObject();
		jsonObj.put("data", users);
		jsonObj.put("recordsTotal",pageModel.getRecordCount());
		jsonObj.put("recordsFiltered", pageModel.getRecordCount());
		
		return jsonObj;
	}
}
