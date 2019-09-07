package com.yarui.service;

import java.util.List;

import com.yarui.pojo.EnterpriseInformation;

public interface EnterpriseInformationService {
	/**
	 * 获取公司信息
	 * @return
	 */
	List<EnterpriseInformation> findInformation();
}
