package com.uulku.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uulku.springdatajpa.entities.Student;
import com.uulku.springdatajpa.repos.StudentRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	@Test
	void testSaveStudent() {
		//create a Student.
		Student student = new Student();
		student.setId(1l);
		student.setName("Utku");
		student.setTestScore(100);
		//Save it.
		studentRepository.save(student);
		
		//Read the Student from repository:
		Student savedStudent = studentRepository.findById(1l).get();
		//assertNotNull(savedStudent); //It shouldn't be null
		System.out.println("Saved Student Name: " + savedStudent.getName()); //It should be Utku
		
		//Update Student:
		savedStudent.setName("Utku Ulku");
		studentRepository.save(savedStudent);
		
		//Read updated student:
		Student updatedStudent = studentRepository.findById(1l).get();
		System.out.println("Updated Student Name: " + updatedStudent.getName());
		//assertEquals("Utku Ulku", updatedStudent.getName()); //It should be Utku Ulku
		
		//Delete the Student with Id 1:
		studentRepository.deleteById(1l);
		if(studentRepository.findById(1l).equals(Optional.empty())) {
			System.out.println("studentRepository.findById(1l) is empty!"); //It should be empty.
		}else {
			//do nothing.
		}
		assertEquals(Optional.empty(), studentRepository.findById(1l));
		
	}

}
