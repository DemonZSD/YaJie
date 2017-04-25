package com.cn.yajie.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cn.yajie.pojo.Company;
import static com.cn.yajie.util.common.JieYaConstants.COMPANYTABLE;

public interface ICompanyDao {
	
	@Select("select * from " + COMPANYTABLE )
	List<Company> getCompanyListAll();

	@Select("select * from " + COMPANYTABLE + " where cid = #{cid}")
	Company getCompanyNameByCid(String companyId);
}