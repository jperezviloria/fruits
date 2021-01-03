package com.supermarket.fruits.controller;

import com.supermarket.fruits.model.Fruits;
import com.supermarket.fruits.model.Students;
import com.supermarket.fruits.service.implementation.StudentsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("student")
public class StudentsController {

    @Autowired
    StudentsServiceImplementation studentsServiceImplementation;

    @GetMapping("/getall")
    public List<Students> getAllStudents(){
        return studentsServiceImplementation.getAllStudents();
    }

    @PostMapping("/save")
    public String saveStudents(@RequestBody Students students){
        return studentsServiceImplementation.saveStudent(students);
    }

    @GetMapping("/{idStudents}")
    public Optional<Students> getStudentById (@PathVariable String  idStudents){
        return studentsServiceImplementation.getStudentById( idStudents);
    }

}
