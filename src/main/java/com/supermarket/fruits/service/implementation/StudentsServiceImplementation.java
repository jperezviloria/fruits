package com.supermarket.fruits.service.implementation;

import com.supermarket.fruits.model.Students;
import com.supermarket.fruits.repository.StudentsRepository;
import com.supermarket.fruits.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentsServiceImplementation implements StudentsService {

    @Autowired
    StudentsRepository studentsRepository;


    @Override
    public List<Students> getAllStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Optional<Students> getStudentById(String idStudent) {
        return studentsRepository.findById (idStudent);
    }

    @Override
    public String saveStudent(Students students) {

        studentsRepository. save(students);
        return "funcion exitosa";

    }
}
