package com.demo.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.in.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
