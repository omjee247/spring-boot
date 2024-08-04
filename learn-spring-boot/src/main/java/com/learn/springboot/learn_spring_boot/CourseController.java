package com.learn.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/course")
	public List<Courses> retrieveAlCourses(){
		return Arrays.asList(
				new Courses(1, "Learn aws", "Cloud"),
				new Courses(2, "Learn Devops", "Python"),
				new Courses(3, "Azure", "CLoud")
				);
	}
}
