package com.lakshy.springboot.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lakshy.springboot.restapi.models.Course;

//@Service
public class CourseServiceImpl implements CourseService 
{	

	List<Course> list = null;
	
	public CourseServiceImpl() 
	{
		list = new ArrayList<Course>();
		list.add(new Course(1, "Java course", "The ultimate java course"));
		list.add(new Course(2, "Nodejs course", "The ultimate nodejs course"));
	}

	@Override
	public List<Course> getCourses() 
	{
		return list;
	}

	@Override
	public Course getThisCourse(long courseID) {
		Course ansCourse = null;
		for(Course course : list) {
			if(course.getId() == courseID) {
				ansCourse = course;
			}
		}
		return ansCourse;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		for(Course c : list) {
			if(course.getId() == c.getId()) {
				c.setName(course.getName());
				c.setDescription(course.getDescription());
			}
		}
		return course;
	}

	@Override
	public void deleteCourse(long courseID) {
		Course ansCourse = null;
		for(Course course : list) {
			if(course.getId() == courseID) {
				ansCourse = course;
				list.remove(list.indexOf(ansCourse));
			}
		}
		if(ansCourse == null) {
			
		}
	}

}
