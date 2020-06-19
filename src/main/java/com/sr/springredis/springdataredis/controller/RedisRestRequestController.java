package com.sr.springredis.springdataredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sr.springredis.springdataredis.model.Student;

import lombok.extern.slf4j.Slf4j;
import com.sr.springredis.springdataredis.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

@RestController
@Slf4j
public class RedisRestRequestController {

	@Autowired
	StudentRepository studentrepo;
	
    @GetMapping("/student/{id}")
    public Student fetchStudent(@PathVariable("id") String id) {
    	System.out.println(String.format("Before fetching from Student Repo with id:%s", id));
    	
    	Optional<Student> opt = studentrepo.findById(id);
    	if (!opt.isPresent()) 
    		return null;
    	return (Student) opt.get();
    	
    }
    
    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
    //	Student student = new Student("10", "Sumi", Gender.FEMALE, 12); 
    	System.out.println(String.format("Save Student with id:%s name:%s", student.getId(), student.getName()));
    	studentrepo.save(student);
    }
    
    @GetMapping("/hello")
    public String sayHello() {
    	return "hello Sumithra!";
    }
}
