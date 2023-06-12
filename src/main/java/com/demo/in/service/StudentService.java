package com.demo.in.service;

import com.demo.in.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public Student getSingleStudent(Integer sid);
}
