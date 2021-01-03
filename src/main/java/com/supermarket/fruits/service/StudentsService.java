package com.supermarket.fruits.service;

import com.supermarket.fruits.model.Students;

import java.util.List;
import java.util.Optional;

public interface StudentsService {

    List<Students> getAllStudents();

    Optional<Students> getStudentById(String idStudent );



     String saveStudent (Students students);



}
