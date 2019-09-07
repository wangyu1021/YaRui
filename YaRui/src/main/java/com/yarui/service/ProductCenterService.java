package com.yarui.service;

import java.util.List;

import com.yarui.pojo.ProductCenter;

public interface ProductCenterService {
	/**
	 * 查询产品分类
	 * @return
	 */
	List<ProductCenter> findProductCenter();
	/**
	 * 增加产品分类
	 * @param classification
	 */
	void addProdcutCenter(String classification);

}
