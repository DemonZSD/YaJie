package com.cn.yajie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cn.yajie.dao.ICompanyDao;
import com.cn.yajie.pojo.Company;
import com.cn.yajie.service.ICompanyService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService{

	@Resource
	private ICompanyDao companyDao;
	
	public List<Company> getCompanyListAll() {
		
		return companyDao.getCompanyListAll();
	}
	
	public Company getCompanyNameByCid(String companyId) {
		return companyDao.getCompanyNameByCid(companyId);
	}

}
