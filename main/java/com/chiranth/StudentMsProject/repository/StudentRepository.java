package com.chiranth.StudentMsProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiranth.StudentMsProject.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}