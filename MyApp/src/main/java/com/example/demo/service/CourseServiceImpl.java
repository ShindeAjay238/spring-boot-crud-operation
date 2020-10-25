package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Course> getCourses() {
		return courseRepository.findAll() ;
	}

	@Override
	public Course getCourse(long courseId) {
		return courseRepository.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		courseRepository.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public void deleteCourse(long parseLong) {
		
		Course entity= courseRepository.getOne(parseLong);
		
		courseRepository.delete(entity);
	}

	/*
	 * List<Course> list;
	 * 
	 * 
	 * public CourseServiceImpl() {
	 * 
	 * list = new ArrayList<>(); list.add(new
	 * Course(145,"java core course","this is course of java")); list.add(new
	 * Course(146,"spring boot","this is course of spring boot")); list.add(new
	 * Course(147,"Css","this is course of css"));
	 * 
	 * }
	 * 
	 * @Override public List<Course> getCourses() {
	 * 
	 * return list; }
	 * 
	 * @Override public Course getCourse(long courseId) { Course c= null; for(Course
	 * course:list) { if(course.getId()== courseId)
	 * 
	 * { c=course; break; } }
	 * 
	 * return c; }
	 * 
	 * @Override public Course addCourse(Course course) {
	 * 
	 * list.add(course); return course; }
	 * 
	 * @Override public Course updateCourse(Course course) {
	 * 
	 * list.forEach(e -> { if(e.getId() == course.getId()) {
	 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
	 * });
	 * 
	 * return course; }
	 * 
	 * @Override public void deleteCourse(long parseLong) { list
	 * =list.stream().filter(e -> e.getId() !=
	 * parseLong).collect(Collectors.toList());
	 * 
	 * }
	 */

}
