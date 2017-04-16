package com.cn.yajie.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cn.yajie.pojo.Admin;
import static com.cn.yajie.util.common.JieYaConstants.ADMINTABLE;

public interface IAdminDao {
	
	
	/**
	 * 管理员登陆
	 * @param loginname
	 * @param password
	 * @return
	 */
	@Select("select * from "+ ADMINTABLE + " where loginname = #{loginname} and password = #{password}"  )
	Admin checkAdmin(@Param("loginname") String loginname,@Param("password") String password) ;

	/**
	 * 根据登录名 查询用户
	 * @param loginname
	 * @return
	 */
	@Select("select * from " + ADMINTABLE + " where loginname = #{loginname} limit 1 ")
	Admin getByLoginname(String loginname);
}
