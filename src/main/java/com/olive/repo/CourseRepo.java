package com.olive.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
