package com.example.studentmanagementsystem1.repository;

import com.example.studentmanagementsystem1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
