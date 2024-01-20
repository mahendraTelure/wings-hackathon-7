package com.beyondlimisedu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beyondlimisedu.Model.Course;
import com.beyondlimisedu.Model.User;
import com.beyondlimisedu.Repository.CourseRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class CourseController {
	
	@Autowired
	CourseRepository courseRepository;
	
	@GetMapping("/course")
	public List<Course> getCourse() {
		return courseRepository.findAll();
	}
	
	
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return courseRepository.save(course);
	}

//	adding user to the database
	@PostMapping("/course")
	public Course createCourse(@RequestBody Course course) {
		return courseRepository.save(course);

	}
	

}
