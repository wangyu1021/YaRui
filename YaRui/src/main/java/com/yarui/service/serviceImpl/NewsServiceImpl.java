package com.yarui.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.NewsDao;
import com.yarui.pojo.News;
import com.yarui.service.NewsService;
import com.yarui.util.PageUtil;
import com.yarui.vo.Page;


@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsDao;
	public Page<News> findPageObjects(Integer pageCurrent) {
		//1.参数校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码不正确");
		//2.查询总记录数并进行验证
		int rowCount=newsDao.getRowCount();
		if(rowCount==0)
			throw new RuntimeException("没有记录");
		//3.查询当前页记录
		int pageSize=10;
		int startIndex=(pageCurrent-1)*pageSize;
		List<News> records=
				newsDao.findPageObjects(startIndex, pageSize);
		//4.进行封装并返回
		Page<News> po =
				PageUtil.newInstance(pageCurrent, rowCount, pageSize, records);
		return po;
	}

}
