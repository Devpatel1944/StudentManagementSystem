package com.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sms.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
