package com.student.managment.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.managment.entity.Student;
import com.student.managment.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studservice;
	
	//Handler method to handle list students and return Mode and View
	
	@GetMapping("/students")
	public String listStudents(Model model)
	{
	model.addAttribute("students",  studservice.getAllStudents());
	return "students";
	}
	
	
	
	
	
	
	
	
	/*
	 * @GetMapping("/getStudents") public List<Student> getListStudents() { return
	 * studservice.getAllStudents(); }
	 * 
	 * @PostMapping("/setStudents") public Student setListStudents(@RequestBody
	 * Student s) { Student output = new Student(); output=
	 * studservice.setAllStudents(s);
	 * output.setTransactionResponse("Record Inserted successfully"); return output;
	 * }
	 * 
	 */
	
	
	
	
	
}
