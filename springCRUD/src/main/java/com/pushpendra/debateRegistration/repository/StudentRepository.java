package com.pushpendra.debateRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pushpendra.debateRegistration.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
