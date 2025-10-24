package com.example.demo.Repository;

import com.example.demo.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface StudentRepository  extends MongoRepository<Student, String> {


    List<Student> findByName(String name);
}
