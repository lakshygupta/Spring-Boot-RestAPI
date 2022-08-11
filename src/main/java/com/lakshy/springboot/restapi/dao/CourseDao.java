package com.lakshy.springboot.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lakshy.springboot.restapi.models.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	
}
