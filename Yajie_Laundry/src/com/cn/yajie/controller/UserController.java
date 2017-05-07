package com.cn.yajie.controller;


import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.cn.yajie.controller.base.BaseController;
import com.cn.yajie.pojo.Company;
import com.cn.yajie.pojo.User;
import com.cn.yajie.util.common.ConvertUtil;
import com.cn.yajie.util.common.PageModel;
import com.mysql.fabric.xmlrpc.base.Data;

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
	
	/**
	 * 
	 * @param flag 1:表示跳转到修改页面，2表示执行添加提交表单
	 * @param user
	 * @param mv
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userAdd")
	public ModelAndView userAdd(String flag,@ModelAttribute User user , ModelAndView mv) throws Exception{
		if(("1").equals(flag)){//表示跳转到修改页面
			/**
			 * 查询单位列表
			 */
			List<Company> companyList = companyService.getCompanyListAll();
			mv.addObject("companyList", companyList);
			mv.setViewName("user/addUser");
		}else if(("2").equals(flag)){//执行添加提交表单
			user.setUid(UUID.randomUUID().toString());
			if(user.getCompanyName()==null||("").equals(user.getCompanyName())){
				Company company = companyService.getCompanyNameByCid(user.getCompanyId());
				user.setCompanyName(company.getCname());//公司名称
				user.setUcompanyAddr(company.getCaddr());//公司地址
			}
			user.setAddDate(ConvertUtil.Data2String(new Date(), "yyyyMMdd"));
			userService.insertUser(user);
			mv.setViewName("user/userlist");
		}
		return mv;
	}
	
	@RequestMapping("/editUser")
	public ModelAndView editUser(String flag,@ModelAttribute User user , ModelAndView mv){
		if(("1").equals(flag)){//跳转到修改页面
			/**
			 * 查询单位列表
			 */
			List<Company> companyList = companyService.getCompanyListAll();
			User initUser = userService.getUserById(user.getUid());
			
			mv.addObject("companyList", companyList);
			mv.addObject("userInfo", initUser);
			mv.setViewName("user/editUser");
			
		}else if(("2").equals(flag)){//修改用户表单提交
			if(user.getCompanyName()==null||("").equals(user.getCompanyName())){
				Company company = companyService.getCompanyNameByCid(user.getCompanyId());
				user.setCompanyName(company.getCname());//公司名称
				user.setUcompanyAddr(company.getCaddr());//公司地址
			}
			userService.updateUser(user);
			mv.setViewName("user/userlist");
		}
		return mv;
	}
	
	@RequestMapping("/userdetail")
	public ModelAndView userdetail(@ModelAttribute User user , ModelAndView mv){
		User newUser = userService.getUserById(user.getUid());
		
		mv.addObject("userInfo", newUser);
		mv.setViewName("user/userdetail");
		return mv;
	}
}
