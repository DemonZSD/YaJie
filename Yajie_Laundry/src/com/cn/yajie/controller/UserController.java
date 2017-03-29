package com.cn.yajie.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.yajie.controller.base.BaseController;
import com.cn.yajie.pojo.User;
import com.cn.yajie.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller  
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@Resource
	private IUserService userService;
	
	@RequestMapping("/index")
    public String toIndex(HttpServletRequest request,Model model){
        String userId = request.getParameter("username");
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        Map map = new HashMap<String,String>();
        return "login";
    }
	
	@RequestMapping("/toLogin")
	public void login(@RequestBody User user,HttpServletResponse response) throws Exception{
//		System.out.println(user.toString());
		String mdPwd = DigestUtils.md5Hex(user.getPassword()==null?"":user.getPassword());
		User user2 = this.userService.checkUser(user.getUsername(), mdPwd);
		ObjectMapper om = new ObjectMapper();
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println(om.writeValueAsString(user2));
	}
	
	@RequestMapping("/main")
    public String toMain(HttpServletRequest request,Model model){
        return "main";
    }
}
