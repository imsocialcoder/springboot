package com.uulku.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uulku.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
