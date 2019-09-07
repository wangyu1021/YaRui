package com.yarui.service.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yarui.dao.UserDao;
import com.yarui.pojo.User;
import com.yarui.service.UserService;
import com.yarui.util.MD5Encoder;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public void login(String name, String password) {
		User user = userDao.selectUserByName(name);
		System.out.println(user);
		if(user==null) {
			throw new IllegalArgumentException("用户不存在");
		}
		try {
			if(!MD5Encoder.validPassword(password,user.getPassword())) {
				throw new IllegalArgumentException("密码错误");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("出了一点小错误，请重试");
		}

	}
	public void doRegister(String name,String password) {
		User user = userDao.selectUserByName(name);
		String pwd =null;
		if(user!=null)throw new IllegalArgumentException("该用户名已存在");
		if(password.length()<6)throw new IllegalArgumentException("密码不能小于6位");
		try {
			pwd= MD5Encoder.getEncryptedPwd(password);
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("出了一点小错误，请重试");
		}
		userDao.insertUser(name,pwd);
	}

}
