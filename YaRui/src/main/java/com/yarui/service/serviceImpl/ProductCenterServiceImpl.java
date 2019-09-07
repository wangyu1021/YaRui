package com.yarui.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.ProductCenterDao;
import com.yarui.pojo.ProductCenter;
import com.yarui.service.ProductCenterService;

@Service
public class ProductCenterServiceImpl implements ProductCenterService{
	@Autowired
	private ProductCenterDao productCenterDao;
	
	public List<ProductCenter> findProductCenter() {
		List<ProductCenter> list = productCenterDao.selectProductCenter();
		return list;
	}

	public void addProdcutCenter(String classification) {
		productCenterDao.insertProductCenter(classification);
	}

}
