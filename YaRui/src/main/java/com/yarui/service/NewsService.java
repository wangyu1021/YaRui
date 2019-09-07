package com.yarui.service;

import com.yarui.pojo.News;
import com.yarui.vo.Page;

public interface NewsService {

	Page<News> findPageObjects(Integer pageCurrent);

}
