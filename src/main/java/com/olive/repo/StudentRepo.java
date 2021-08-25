package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
