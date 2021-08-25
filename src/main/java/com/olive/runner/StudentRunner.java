package com.olive.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Course;
import com.olive.model.Student;
import com.olive.repo.CourseRepo;
import com.olive.repo.StudentRepo;
@Component
public class StudentRunner implements CommandLineRunner{
	@Autowired
	private CourseRepo crepo;
	@Autowired
	private StudentRepo srepo;
	
	
	public void run(String... args) throws Exception {
		Course c1=new Course(101, "Java", 5000.0);
		Course c2=new Course(102, "Java Adv", 6000.0);
		Course c3=new Course(103, "Spring", 8000.0);
		Course c4=new Course(104, "Boot", 9000.0);
		Set<Course> cc1=new HashSet<Course>();
		cc1.add(c1);
		cc1.add(c2);
		Set<Course> cc2=new HashSet<Course>();
		cc2.add(c3);
		cc2.add(c4);
		
		crepo.saveAll(cc1);
		crepo.saveAll(cc2);
		
		srepo.save(new Student(10, "Manoj", "mksingh01995@gmail.com", cc1));
		srepo.save(new Student(20, "Ravi Kumar Singh", "rksingh01995@gmail.com", cc2));
		System.out.println("DONE");
		
		
	}

}
