package com.example.studentpractice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

// Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Data
// Lombok annotation to generate a constructor with all fields as parameters
@AllArgsConstructor
// Lombok annotation to generate a no-argument constructor
@NoArgsConstructor
// JPA annotation to mark this class as a JPA entity
@Entity
public class Student {


    // JPA annotation to specify the primary key of the entity
    @Id
    // JPA annotation to specify the primary key generation strategy
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique identifier for each student

    private String name; // Name of the student

    // JPA annotation to specify that this field should be treated as a date
    @Temporal(TemporalType.DATE)
    // Spring annotation to specify the date format for this field
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob; // Date of birth of the student

    private boolean passed; // Indicates if the student has passed or not

    private double gpa; // Grade Point Average of the student
}