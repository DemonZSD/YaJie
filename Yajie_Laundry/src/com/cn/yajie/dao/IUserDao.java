package com.cn.yajie.dao;

import java.util.Map;

import com.cn.yajie.pojo.User;

public interface IUserDao {
	
    int deleteByUid(String uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByUid(String uid);

    int updateByUidSelective(User record);

    int updateByUid(User record);
    
    User checkUser(Map map);
}