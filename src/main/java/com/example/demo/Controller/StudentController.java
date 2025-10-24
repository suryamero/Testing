package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {

        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student student) {

        return service.save(student);
    }

    @GetMapping
    public List<Student> getAll() {

        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {

        service.delete(id);
    }

}
