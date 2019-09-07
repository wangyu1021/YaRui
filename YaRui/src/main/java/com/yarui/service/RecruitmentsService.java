package com.yarui.service;

import java.util.List;

import com.yarui.pojo.Recruitment;

public interface RecruitmentsService {
	/**
	 * 查询所有招聘信息
	 */
	List<Recruitment> findRecruitments();

	int getRows();

}
