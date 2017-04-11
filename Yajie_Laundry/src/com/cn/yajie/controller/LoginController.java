package com.cn.yajie.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.yajie.controller.base.BaseController;
import com.cn.yajie.pojo.User;
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
        String userId = request.getParameter("username");
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        Map map = new HashMap<String,String>();
        return "login";
    }
	
	/**
	 * 登陆Form表单
	 * @param user
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/toLogin")
	public void login(@RequestBody User user,HttpServletResponse response) throws Exception{
//		System.out.println(user.toString());
		String mdPwd = DigestUtils.md5Hex(user.getPassword()==null?"":user.getPassword());
		User user2 = this.userService.checkUser(user.getUsername(), mdPwd);
		ObjectMapper om = new ObjectMapper();
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(om.writeValueAsString(user2));
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
