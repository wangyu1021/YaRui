package com.yarui.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.RecruitmentsDao;
import com.yarui.pojo.Recruitment;
import com.yarui.service.RecruitmentsService;

@Service
public class RecruitmentServiceImpl implements RecruitmentsService {
	@Autowired
	private RecruitmentsDao recruitmentsDao;
	public List<Recruitment> findRecruitments() {
		List<Recruitment> list =recruitmentsDao.selectRecruitment();
		if(list.isEmpty()) {
			throw new RuntimeException("目前没有招聘信息");
		}
		return list;
	}
	public int getRows() {
		int rows=recruitmentsDao.getRows();
		return rows;
	}

}
