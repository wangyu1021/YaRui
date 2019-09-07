package com.yarui.pojo;

import java.io.Serializable;

public class ProductCenter implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8333999749872725975L;
	private int id;
	private String classification;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	@Override
	public String toString() {
		return "ProductCenter [id=" + id + ", classification=" + classification + "]";
	}
	
}
