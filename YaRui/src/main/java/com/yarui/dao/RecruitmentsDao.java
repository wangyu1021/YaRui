package com.yarui.dao;

import java.util.List;

import com.yarui.pojo.Recruitment;

public interface RecruitmentsDao {

	List<Recruitment> selectRecruitment();

	int  getRows();

}
