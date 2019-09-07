package com.yarui.dao;

import java.util.List;


import com.yarui.pojo.ProductCenter;

public interface ProductCenterDao {

	List<ProductCenter> selectProductCenter();

	void insertProductCenter(String classification);

}
