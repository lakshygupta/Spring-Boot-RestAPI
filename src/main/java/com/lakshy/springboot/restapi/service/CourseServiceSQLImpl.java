package com.lakshy.springboot.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakshy.springboot.restapi.dao.CourseDao;
import com.lakshy.springboot.restapi.models.Course;

@Service
public class CourseServiceSQLImpl implements CourseService {

	@Autowired
	CourseDao courseDao;
	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getThisCourse(long courseID) {
		Course course = courseDao.getOne(courseID);
		return course;
	}

	@Override
	public Course addCourse(Course course) {
		Course entity = courseDao.save(course);
		return entity;
	}

	@Override
	public Course updateCourse(Course course) {
		Course entity = courseDao.save(course);
		return entity;
	}

	@Override
	public void deleteCourse(long courseID) {
		Course course = courseDao.getOne(courseID);
		courseDao.delete(course);
	}

}
