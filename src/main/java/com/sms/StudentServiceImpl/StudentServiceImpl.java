package com.sms.StudentServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sms.Entity.Student;
import com.sms.Repository.StudentRepo;
import com.sms.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepo studentRepo;
	
	

	public StudentServiceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}



	public List<Student> GetAllStudents() {
		
		return studentRepo.findAll();
	}



	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
	}
 
}
