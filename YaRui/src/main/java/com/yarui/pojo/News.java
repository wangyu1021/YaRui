package com.yarui.pojo;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4078030441940033492L;
	private int id;
	private String title;
	private String author;
	private String content;
	private String image;
	private Date createdTime;
	private String createdUser;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	@Override
	public String toString() {
		return "news [id=" + id + ", title=" + title + ", author=" + author + ", content=" + content + ", image="
				+ image + ", createdTime=" + createdTime + ", createdUser=" + createdUser + "]";
	}
	
}
