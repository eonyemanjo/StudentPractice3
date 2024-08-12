package com.example.studentpractice.repositories;

import com.example.studentpractice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Interface for the Student repository, extending JpaRepository to provide CRUD operations
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query method to find students by their ID
    List<Student> findStudentById(long kw);
}