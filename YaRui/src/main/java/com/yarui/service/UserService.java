package com.yarui.service;


public interface UserService {
	/**
	 * 登录
	 * @param name
	 * @param password
	 */
	void login(String name, String password);

	void doRegister(String name,String  password);

}
