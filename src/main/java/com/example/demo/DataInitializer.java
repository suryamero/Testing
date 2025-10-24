package com.example.demo;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataInitializer implements CommandLineRunner {

    private final StudentRepository repo;

    public DataInitializer(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        if (repo.findByName("Fathima").isEmpty()) {
            Student s1 = new Student();
            s1.setName("Fathima");
            s1.setEmail("sindhu@gmail.com");
            s1.setAge(25);
            s1.setCity("Sandy");
            repo.save(s1);
            System.out.println("✅ Sindhu inserted");
        }

        if (repo.findByName("Riyaaa").isEmpty()) {
            Student s2 = new Student();
            s2.setName("Riyaaa");
            s2.setEmail("riya@gmail.com");
            s2.setAge(24);
            s2.setCity("Provo");
            repo.save(s2);
            System.out.println("✅ Riya inserted");
        }
    }

}
