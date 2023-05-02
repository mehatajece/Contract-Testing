package com.rahulshettyacademy.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Storage2")
public class AllCourseData {
    @Column(name="course_namee")
	private String course_namee;
    
    @Column(name="id")
	private String id;
 
    @Column(name="price")
	private int price;
    @Column(name="category")
	private String category;
    @Id
	public String getCourse_namee() {
		return course_namee;
	}
	public void setCourse_namee(String course_name) {
		this.course_namee = course_namee;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
