package com.cn.yajie.dao;

import static com.cn.yajie.util.common.JieYaConstants.USERTABLE;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.cn.yajie.dao.provider.UserDynaSqlProvider;
import com.cn.yajie.pojo.User;
public interface IUserDao {
	
	@Select("select * from " + USERTABLE + " where uid = #{uid}")
    User getUserByUid(String uid);
	
	@Select("select * from " + USERTABLE )
	List<User> getUserListAll();
	
	@SelectProvider(type=UserDynaSqlProvider.class,method="selectWithParam")
	List<User> findUserList(Map<String,Object> params);
	
	
	@SelectProvider(type=UserDynaSqlProvider.class,method="countWithParams")
	int countWithParams(Map<String,Object> params);

	@Insert("INSERT INTO " + USERTABLE +
			" ( uid,username,umobile,uhomeAddr,companyName,ucompanyAddr,addDate ) VALUES (#{uid},#{username},#{umobile},#{uhomeAddr},#{companyName},#{ucompanyAddr},#{addDate})")
	void insertUser(User user);
}