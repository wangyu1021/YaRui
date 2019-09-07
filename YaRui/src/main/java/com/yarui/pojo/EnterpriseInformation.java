package com.yarui.pojo;

import java.io.Serializable;

public class  EnterpriseInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6358171576582393250L;
	private int id;
	private String name;
	private String introduction;
	private String direction;
	private String phone;
	private String email;
	private String address;
	private String linkman;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	@Override
	public String toString() {
		return "EnterpriseInformation [id=" + id + ", name=" + name + ", introduction=" + introduction + ", direction="
				+ direction + ", phone=" + phone + ", email=" + email + ", address=" + address + ", linkman=" + linkman
				+ "]";
	}
	
}
