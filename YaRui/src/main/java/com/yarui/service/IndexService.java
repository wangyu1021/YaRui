package com.yarui.service;

import java.util.List;

import com.yarui.pojo.Shuffling;

public interface IndexService {
	/**
	 * 获取所有轮播图地址
	 * @return
	 */
	List<Shuffling> findShuffling();
	/**
	 * 修改轮播图
	 */
	void updateShuffling(String url,Integer id);
}
