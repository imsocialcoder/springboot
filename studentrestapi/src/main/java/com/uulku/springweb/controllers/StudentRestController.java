package com.uulku.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uulku.springweb.entities.Student;
import com.uulku.springweb.repos.StudentRepository;

@RestController
public class StudentRestController {
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(value = "/students/", method = RequestMethod.GET)
	public List<Student> getStudents(){
		return studentRepository.findAll();
	}
	
	@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("id") long id){
		return studentRepository.findById(id).get();
	}
	
	@RequestMapping(value = "/students/", method = RequestMethod.POST)
	public Student createStudent(@RequestBody Student student){
		return studentRepository.save(student);
	}
	
	@RequestMapping(value = "/students/", method = RequestMethod.PUT)
	public Student updateStudent(@RequestBody Student student){
		return studentRepository.save(student);
	}
	
	@RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("id") long id){
		studentRepository.deleteById(id);
	}
}
