package com.cn.yajie.dao;

import com.cn.yajie.pojo.Product;

public interface IProductDao {
    int insert(Product record);

    int insertSelective(Product record);
}