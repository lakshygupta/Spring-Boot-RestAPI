package com.lakshy.springboot.restapi.service;

import java.util.List;

import com.lakshy.springboot.restapi.models.Course;

public interface CourseService 
{	
	List<Course> getCourses();
	
	Course getThisCourse(long courseID);
	
	Course addCourse(Course course);
	
	Course updateCourse(Course course);
	
	void deleteCourse(long courseID);
}
