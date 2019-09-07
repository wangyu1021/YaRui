package com.yarui.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.ProductDao;
import com.yarui.pojo.Product;
import com.yarui.service.ProductService;
import com.yarui.util.PageUtil;
import com.yarui.vo.Page;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	public Page<Product> findPageObjects(Integer pageCurrent, Integer id) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=productDao.getRowCount(id);
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=9;
		int startIndex=(pageCurrent-1)*pageSize;
		List<Product> records=
				productDao.findPageObjects(id,startIndex, pageSize);
		//4.进行封装并返回
		Page<Product> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;
	}

	public void addProduct(Product product) {
		productDao.insertProduct(product);
	}

}


