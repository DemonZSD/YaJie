package com.cn.yajie.service;

import java.util.List;

import com.cn.yajie.pojo.User;
import com.cn.yajie.util.common.PageModel;

public interface IUserService {
	/**
	 * 根据用户ID获取用户对象
	 * @param uid
	 * @return
	 */
	User getUserById(String uid);
	
	/**
	 * 获取所有用户列表
	 * @return
	 */
	List<User> getUserListAll();
	
	/**
	 * 获取所有用户列表
	 * @param user
	 * @param pageModel
	 * @return
	 */
	List<User> findUser(User user, PageModel pageModel);
	
}
