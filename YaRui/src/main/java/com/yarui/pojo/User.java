package com.yarui.pojo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1556489739379850870L;
	@ApiModelProperty(hidden = true)
	private int id;
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
}
