package com.cn.yajie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.yajie.controller.base.BaseController;
@Controller  
@RequestMapping("/statistic")
public class StaticController extends BaseController{
	
	@RequestMapping(value="/statistic")
	public String statictic() throws Exception{
		return "statistic/statistic";
	}
}
