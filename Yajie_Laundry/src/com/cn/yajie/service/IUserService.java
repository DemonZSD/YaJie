package com.cn.yajie.service;

import com.cn.yajie.pojo.User;

public interface IUserService {
	
    public User getUserById(String userId);  
    
    public User checkUser(String username,String password);
}
