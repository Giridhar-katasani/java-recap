package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentDao;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;


import com.example.demo.entity.Student;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;
	
	public StudentController() {
		
	}
	
	@PostMapping("/save")
	public void saveStudent(@RequestBody Student student) {
		System.out.println("helo world!!!!");
		studentDao.saveStudent();
	}
	
	
	@GetMapping("/test")
	public String checkController() {
//		student.setName("cally");
//		student.setDepartment("msda");
//		student.setId(01);
//		System.out.print(student);
		return "from the student Controller";
	}
	
	// reading path variables
	@GetMapping("/read/{id}")
	public void readStudentById(@PathVariable int id) {
		System.out.println("hello");
		studentDao.readStudentById(id);
	}
	
//	using query-params
	@GetMapping("/read")
	public void readStudentByIdQuery(@RequestParam int id) {
		studentDao.readStudentById(id);
	}
	
	@PutMapping("/update/{id}")
	public void updateStudenById(@PathVariable int id) {
		studentDao.updateStudentById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable int id) {
		studentDao.deleteById(id);
	}
}
