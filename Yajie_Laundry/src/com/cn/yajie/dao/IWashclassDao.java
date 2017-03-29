package com.cn.yajie.dao;

import com.cn.yajie.pojo.Washclass;

public interface IWashclassDao {
    int deleteByPrimaryKey(String wid);

    int insert(Washclass record);

    int insertSelective(Washclass record);

    Washclass selectByPrimaryKey(String wid);

    int updateByPrimaryKeySelective(Washclass record);

    int updateByPrimaryKey(Washclass record);
}