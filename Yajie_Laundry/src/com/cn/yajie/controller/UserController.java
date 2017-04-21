package com.cn.yajie.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cn.yajie.controller.base.BaseController;
import com.cn.yajie.pojo.User;
import com.cn.yajie.util.common.ConvertUtil;
import com.cn.yajie.util.common.PageModel;

@Controller  
@RequestMapping("/user")
public class UserController extends BaseController{
	
	
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
	public Map<String, Object> userList(HttpServletRequest request) throws Exception{
		String search = request.getParameter("search");
		int pageSize = ConvertUtil.String2Int(request.getParameter("length"));
		//分页查询用户
		User user = new User();
		if(search!=null && ("").equals(search)){
			user.setUsername(search);
			user.setUmobile(search);
		}
		PageModel pageModel = new PageModel();
		pageModel.setPageSize(pageSize);
		List<User> users = userService.findUser(user, pageModel);
		
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("users", users);
		
		return model;
	}
}
