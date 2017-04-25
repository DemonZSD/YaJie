package com.cn.yajie.service;

import java.util.List;

import com.cn.yajie.pojo.Company;

public interface ICompanyService {
	/**
	 * 查询所有单位列表
	 * @return
	 */
	List<Company> getCompanyListAll();

	/**
	 * 根据companyId 查询公司名称
	 * @param companyId
	 * @return
	 */
	Company getCompanyNameByCid(String companyId);
}
