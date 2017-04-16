package com.cn.yajie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.yajie.controller.base.BaseController;
import com.cn.yajie.pojo.Admin;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{
	
	/**
	 * 跳转到登陆页面
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/index")
    public String toIndex(HttpServletRequest request,Model model){
        String loginname = request.getParameter("loginname");
        Admin admin = adminService.getByLoginname(loginname);
        model.addAttribute("admin", admin);
        return "login";
    }
	
	/**
	 * 登陆Form表单
	 * @param user
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/toLogin")
	public void login(@RequestBody Admin admin,HttpSession session,HttpServletResponse response) throws Exception{
		String mdPwd = DigestUtils.md5Hex(admin.getPassword()==null?"":admin.getPassword());
		Admin loginAdmin = adminService.login(admin.getLoginname(), mdPwd);
		ObjectMapper om = new ObjectMapper();
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(om.writeValueAsString(loginAdmin));
	}
	
	/**
	 * 登陆成功页面
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/main")
    public String toMain(HttpServletRequest request,Model model){
        return "main";
    }
}
