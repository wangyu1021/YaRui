package com.yarui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarui.pojo.JsonResult;
import com.yarui.pojo.Recruitment;
import com.yarui.service.RecruitmentsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin
@Controller
@RequestMapping("recruitments")
@Api(value = "/recruitments", tags = "招聘接口")
public class RecruitmentsController {
	@Autowired
	private RecruitmentsService recruitmentService;

	@RequestMapping("findRecruitment.do")
	@ResponseBody
	@ApiOperation(value = "招聘信息", notes = "招聘信息", httpMethod = "GET", response = JsonResult.class)
	public JsonResult findRecruitment() {
		JsonResult json=new JsonResult();
		try {
			List<Recruitment> list = recruitmentService.findRecruitments();
			json.setState(1);
			json.setData(list);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	@RequestMapping("getRows.do")
	@ResponseBody
	@ApiOperation(value = "招聘信息数量", notes = "招聘信息数量", httpMethod = "GET", response = JsonResult.class)
	public JsonResult getRows() {
		JsonResult json=new JsonResult();
		try {
			int rows= recruitmentService.getRows();
			json.setState(1);
			json.setMessage(""+rows);
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}

}
