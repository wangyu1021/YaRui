package com.yarui.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarui.pojo.EnterpriseInformation;
import com.yarui.service.EnterpriseInformationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("/enterprise")
@Api(value = "/enterprise", tags = "Enterpise接口")
public class EnterpriseController {
	@Autowired
	private EnterpriseInformationService informationService;
	
	
	@RequestMapping("findInformation.do")
	@ResponseBody
	@ApiOperation(value = "获取信息", notes = "获取信息", httpMethod = "GET", response = Map.class)
	public Map<String,Object> findInformation(){
		List<EnterpriseInformation> list = informationService.findInformation();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("informationList", list);
		return map;
	}
	
}
