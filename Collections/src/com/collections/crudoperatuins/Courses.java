package com.collections.crudoperatuins;

public class Courses {
	int courseId;
	String courseName;
	
	
	
	public Courses(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	
	
	
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	
	

}
