package com.yarui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarui.pojo.JsonResult;
import com.yarui.pojo.News;
import com.yarui.service.NewsService;
import com.yarui.vo.Page;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@Api(value="/news",tags="新闻接口")
public class NewsController {
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("/findProductByProductCenterId.do")
	@ResponseBody
	@ApiOperation(value = "分页获取新闻", notes = "分页获取新闻", httpMethod = "GET", response = JsonResult.class)
	public JsonResult doFindEnterpriseInformationPage(Integer pageCurrent) {
		JsonResult json = new JsonResult();
		try {
			Page<News> page = newsService.findPageObjects(pageCurrent);
			json.setState(1);
			json.setData(page);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
}
