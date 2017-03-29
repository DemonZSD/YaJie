package com.cn.yajie.dao;

import com.cn.yajie.pojo.Company;

public interface ICompanyDao {
    int deleteByPrimaryKey(String cid);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}