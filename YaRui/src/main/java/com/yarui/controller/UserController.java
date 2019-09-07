package com.yarui.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yarui.pojo.JsonResult;
import com.yarui.pojo.User;
import com.yarui.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Controller
@RequestMapping("user")
@Api(value = "/user", tags = "User接口")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("login.do")
	@ResponseBody
	@ApiOperation(value = "登录", notes = "登录", httpMethod = "POST", response = JsonResult.class)
	public JsonResult doLogin(@RequestBody User user) {
		System.out.println(user.getName());
		JsonResult json=new JsonResult();
		try {
			userService.login(user.getName(),user.getPassword());
			json.setState(1);
			json.setMessage("登录成功");
		} catch (Exception e) {
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
	}
	@RequestMapping("doRegister.do")
	@ResponseBody
	@ApiOperation(value = "注册", notes = "注册", httpMethod = "POST", response = JsonResult.class)
	public JsonResult doRegister(@RequestBody User user) {
		String name=user.getName();
		System.out.println(name);
		String password=user.getPassword();
		JsonResult json=new JsonResult();
		try {
			userService.doRegister(name,password);
			json.setState(1);
			json.setMessage("注册成功");
		} catch (Exception e) {
			e.printStackTrace();
			json.setState(0);
			json.setMessage(e.getMessage());
		}
		return json;
		
	}
}
