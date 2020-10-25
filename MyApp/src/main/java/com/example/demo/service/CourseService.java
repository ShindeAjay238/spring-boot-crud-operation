package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;


public interface CourseService  {

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	void deleteCourse(long parseLong);
}
