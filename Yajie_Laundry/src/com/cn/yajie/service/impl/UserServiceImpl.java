package com.cn.yajie.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.yajie.dao.IUserDao;
import com.cn.yajie.pojo.User;
import com.cn.yajie.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource  
    private IUserDao userDao;
	
	public User getUserById(String userId) {
		
		return this.userDao.selectByUid(userId);
	}

	public User checkUser(String username, String password) {
		Map<String , String> map = new HashMap<String , String>();
		map.put("username", username);
		map.put("password", password);
		return this.userDao.checkUser(map);
	}

}
