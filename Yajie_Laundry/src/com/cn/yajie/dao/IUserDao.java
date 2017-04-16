package com.cn.yajie.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Select;
import static com.cn.yajie.util.common.JieYaConstants.USERTABLE;
import com.cn.yajie.pojo.User;

public interface IUserDao {
	
    User selectByUid(String uid);
    
    
    @Select("select * from "+USERTABLE+" where loginname = #{loginname} and password = #{password}")
    User checkUser(Map map);
}