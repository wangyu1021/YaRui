package com.yarui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yarui.pojo.News;

public interface NewsDao {

	int getRowCount();

	List<News> findPageObjects(@Param("startIndex")int startIndex, @Param("pageSize")int pageSize);
	
}
