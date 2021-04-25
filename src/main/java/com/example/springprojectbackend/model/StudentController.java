package com.example.springprojectbackend.model;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springprojectbackend.Repository.StudentRepository;

@CrossOrigin(origins ="https://localhost:3000")
@RestController
@RequestMapping("/api/")
public class StudentController {
	 
	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
		
	}
	}
	

