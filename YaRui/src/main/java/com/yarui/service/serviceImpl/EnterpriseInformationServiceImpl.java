package com.yarui.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.EnterpriseInformationDao;
import com.yarui.pojo.EnterpriseInformation;
import com.yarui.service.EnterpriseInformationService;
@Service
public class EnterpriseInformationServiceImpl implements EnterpriseInformationService{
	@Autowired
	private EnterpriseInformationDao informationDao;
	public List<EnterpriseInformation> findInformation() {
		return informationDao.selectInformation();
	}

}
