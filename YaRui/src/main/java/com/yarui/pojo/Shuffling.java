package com.yarui.pojo;

import java.io.Serializable;
/**
 * 首页横播图
 * @author Riyas
 *
 */
public class Shuffling implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8168771494866548110L;
	/**
	 * 
	 */
	private Integer id;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private String imageAddress;

	public String getImageAddress() {
		return imageAddress;
	}

	public void setImageAddress(String imageAddress) {
		this.imageAddress = imageAddress;
	}

	@Override
	public String toString() {
		return "Shuffling [id=" + id + ", imageAddress=" + imageAddress + "]";
	}
	
}
