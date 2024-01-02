package com.example.demo.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Component
public class Course {

	private String department;
	private String name;
	private String courseId;

	private String faculty;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourseId() {
		return courseId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getFaculty() {
		return faculty;
	}
	
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", courseId=" + courseId + ", department=" + department + ", faculty=" + faculty
				+ ", getName()=" + getName() + ", getCourseId()=" + getCourseId() + ", getDepartment()="
				+ getDepartment() + ", getFaculty()=" + getFaculty() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
