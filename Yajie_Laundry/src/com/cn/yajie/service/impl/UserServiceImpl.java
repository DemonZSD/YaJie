package com.cn.yajie.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.yajie.dao.IUserDao;
import com.cn.yajie.pojo.User;
import com.cn.yajie.service.IUserService;
import com.cn.yajie.util.common.PageModel;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource  
    private IUserDao userDao;
	
	public User getUserById(String userId) {
		return userDao.getUserByUid(userId);
	}


	public List<User> getUserListAll() {
		return userDao.getUserListAll();
	}


	public List<User> findUser(User user, PageModel pageModel) {
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("user", user);
		int recordCount = userDao.countWithParams(params);
		pageModel.setRecordCount(recordCount);
		
		if(recordCount>0){
			params.put("pageModel", pageModel);
		}
		
		return userDao.findUserList(params);
	}


	public void insertUser(User user) {
		userDao.insertUser(user);
	}


	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	
}
