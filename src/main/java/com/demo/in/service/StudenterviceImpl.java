package com.demo.in.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.demo.in.entity.Student;
import com.demo.in.exception.StudentNotFoundException;
import com.demo.in.repository.StudentRepository;

@Service
public class StudenterviceImpl implements StudentService{
	
	private StudentRepository studentRepository;

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getSingleStudent(Integer sid) {
		Optional<Student> opt=studentRepository.findById(sid);
		
		 return opt.orElseThrow(()->new StudentNotFoundException("Student with id:"+sid+" Not Avilable"));
	}

	
	
	
}