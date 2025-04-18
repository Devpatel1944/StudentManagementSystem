package com.sms.Service;

import java.util.List;

import com.sms.Entity.Student;

public interface StudentService {
  public  List<Student> GetAllStudents();
   public Student saveStudent(Student student);

}
