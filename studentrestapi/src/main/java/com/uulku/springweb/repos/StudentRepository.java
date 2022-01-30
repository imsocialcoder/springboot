package com.uulku.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uulku.springweb.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
