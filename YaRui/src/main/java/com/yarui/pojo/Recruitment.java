package com.yarui.pojo;

import java.io.Serializable;
import java.util.Date;
/**
 * 招聘信息
 * @author Riyas
 *
 */
public class Recruitment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6602249329775185077L;
	private int id;
	private double minSalary;
	private double maxSalary;
	private String title;
	private String content;
	private String requirements;//需求
	private String address;
	private String level;
	private String type;
	private String position;//职位
	private String education;//学历
	private int number;
	private Date createdTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}
	public double getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	@Override
	public String toString() {
		return "Recruitment [id=" + id + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + ", title=" + title
				+ ", content=" + content + ", requirements=" + requirements + ", address=" + address + ", level=" + level
				+ ", type=" + type + ", position=" + position + ", education=" + education + ", number=" + number
				+ ", createdTime=" + createdTime + "]";
	}
	
}
