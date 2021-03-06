package com.yarui.util;

import java.util.List;

import com.yarui.vo.Page;
/**分页工具类*/
public abstract class PageUtil {
	/** 泛型方法:泛型是实现通用编程的一种方式，可以让代码
	 *  更加灵活*/
	public static <T>Page<T> newInstance(Integer pageCurrent, int rowCount, int pageSize, List<T> records) {
		Page<T> po=new Page<T>();
		po.setRowCount(rowCount);
		po.setRecords(records);
		po.setPageSize(pageSize);
		po.setPageCurrent(pageCurrent);
		po.setPageCount((rowCount-1)/pageSize+1);
		return po;
	}
}
