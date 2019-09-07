package com.yarui.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yarui.pojo.Product;

public interface ProductDao {

	//List<Product> selectProductByProductCenterId(@Param("productcenterId")int id);
	/**
	 * 查询总数
	 * @param productcenterId
	 * @return
	 */
	int getRowCount(@Param("productcenterId")Integer productcenterId);
	/**
	 * 根据分类id查询
	 * @param productcenterId
	 * @param startIndex
	 * @param pageSize
	 * @return
	 */
	List<Product> findPageObjects(@Param("productcenterId")Integer productcenterId,@Param("startIndex") int startIndex, @Param("pageSize")int pageSize);
	/**
	 * 图片地址插入
	 * @param url
	 */
	void insertProduct(@Param("product")Product product);

}
