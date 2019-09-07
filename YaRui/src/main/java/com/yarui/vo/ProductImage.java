package com.yarui.vo;

public class ProductImage {
	private String imageURL;
	private String introductionImageURL;
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getIntroductionImageURL() {
		return introductionImageURL;
	}
	public void setIntroductionImageURL(String introductionImageURL) {
		this.introductionImageURL = introductionImageURL;
	}
	@Override
	public String toString() {
		return "ProductImage [imageURL=" + imageURL + ", introductionImageURL=" + introductionImageURL + "]";
	}
}
