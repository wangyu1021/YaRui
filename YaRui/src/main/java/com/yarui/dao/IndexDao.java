package com.yarui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yarui.pojo.Shuffling;

public interface IndexDao {

	List<Shuffling> selectShuffling();

	void updateShuffling(@Param("url")String url,@Param("id")Integer id);

}
