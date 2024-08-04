package com.learn.springboot.learn_spring_boot;

public class Courses {

	private int id;
	private String courseName;
	private String fundamental;
	
	
	public int getId() {
		return id;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getFundamental() {
		return fundamental;
	}
	public Courses(int id, String courseName, String fundamental) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.fundamental = fundamental;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", courseName=" + courseName + ", fundamental=" + fundamental + "]";
	}
	

}
