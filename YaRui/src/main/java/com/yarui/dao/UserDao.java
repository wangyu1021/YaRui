package com.yarui.dao;


import org.apache.ibatis.annotations.Param;

import com.yarui.pojo.User;

public interface UserDao {

	User selectUserByName(String name);

	void insertUser(@Param("name")String name,@Param("password")String password);

}
