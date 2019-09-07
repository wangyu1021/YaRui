package com.yarui.pojo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 484104648739471832L;
	@ApiModelProperty(hidden = true)
	private int id;
	private int productcenterId;
	private String name;
	private String introduction;
	private double price;
	private int number;
	private String image;
	private String introductionImage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductcenterId() {
		return productcenterId;
	}
	public void setProductcenterId(int productcenterId) {
		this.productcenterId = productcenterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getIntroductionImage() {
		return introductionImage;
	}
	public void setIntroductionImage(String introductionImage) {
		this.introductionImage = introductionImage;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productcenterId=" + productcenterId + ", name=" + name + ", introduction="
				+ introduction + ", price=" + price + ", number=" + number + ", image=" + image + ", introductionImage="
				+ introductionImage + "]";
	}
	
}
