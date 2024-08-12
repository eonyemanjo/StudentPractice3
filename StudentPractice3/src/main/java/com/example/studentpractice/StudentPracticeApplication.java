package com.example.studentpractice;

import com.example.studentpractice.entities.Student;
import com.example.studentpractice.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
// not
// Annotation to mark this class as a Spring Boot application
@SpringBootApplication
public class StudentPracticeApplication {

    // The main method, which serves as the entry point for the Spring Boot application
    public static void main(String[] args) {
        SpringApplication.run(StudentPracticeApplication.class, args);

    }



/*

    // Bean definition for CommandLineRunner, which will run the specified code after the application context is loaded
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            // Save a few Student objects to the repository
            studentRepository.save(new Student(null, "Jam", new Date(), false, 1.2));
            studentRepository.save(new Student(null, "Jen", new Date(), true, 3.2));
            studentRepository.save(new Student(null, "Jok", new Date(), false, 1.0));
            studentRepository.save(new Student(null, "Jos", new Date(), false, 4.2));

            // Retrieve all Student objects from the repository and print their names
            studentRepository.findAll().forEach(p -> {
                System.out.println(p.getName());
            });
        };
    }

 */
}