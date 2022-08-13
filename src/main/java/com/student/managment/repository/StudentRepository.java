package com.student.managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.student.managment.entity.Student;
@Service
public interface StudentRepository extends JpaRepository<Student, Long> {

	
	

}
