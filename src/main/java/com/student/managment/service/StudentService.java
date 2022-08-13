package com.student.managment.service;

import java.util.List;

import com.student.managment.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	Student setAllStudents(Student s);

}
