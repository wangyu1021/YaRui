package com.yarui.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yarui.pojo.JsonResult;
import com.yarui.pojo.Shuffling;
import com.yarui.service.FileService;
import com.yarui.service.IndexService;
import com.yarui.vo.ImageVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("/index")
@Api(value="/index",tags = "首页接口")
public class IndexController {
	@Autowired
	private IndexService indexService;
	@Autowired
	private FileService fileService;
	
	
	//实现文件上传
	@RequestMapping("/findShuffling.do")
	@ResponseBody
	@ApiOperation(value = "轮播图接口", notes = "轮播图接口", httpMethod = "GET", response = Map.class)
	public Map<String ,Object> findShuffling() {
		List<Shuffling> list = indexService.findShuffling();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("shuffling", list);
		return map;
	}
	
	
	//实现文件上传
	@Transactional
	@RequestMapping("/updateImage.do")
	@ResponseBody
	@ApiOperation(value = "修改图片接口", notes = "修改图片接口", httpMethod = "POST", response = JsonResult.class)
	public JsonResult uploadFile(MultipartFile uploadFile,Integer id) {
		JsonResult json =new JsonResult();
		try {
			ImageVO imageVo=fileService.updateFile(uploadFile);
			String url=imageVo.getUrl();
			indexService.updateShuffling(url,id);
			json.setState(1);
			json.setMessage("修改成功");
			json.setData(imageVo);
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage("修改失败");
		}
		return json;
	}

}
