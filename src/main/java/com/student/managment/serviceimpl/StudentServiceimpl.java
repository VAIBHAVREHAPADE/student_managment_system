package com.student.managment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.managment.entity.Student;
import com.student.managment.repository.StudentRepository;
import com.student.managment.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
@Autowired
	StudentRepository studrepo;
	
	@Override
	public List<Student> getAllStudents() {
		return studrepo.findAll();
}

	@Override
	public Student setAllStudents(Student s) {
		// TODO Auto-generated method stub
		return studrepo.save(s);
	}

}
