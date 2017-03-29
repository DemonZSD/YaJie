package com.cn.yajie.dao;

import com.cn.yajie.pojo.Orders;

public interface IOrdersDao {
    int deleteByPrimaryKey(String oid);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}