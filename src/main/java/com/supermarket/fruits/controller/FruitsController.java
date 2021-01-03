package com.supermarket.fruits.controller;

import com.supermarket.fruits.model.Fruits;
import com.supermarket.fruits.service.FruitsServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("fruits")
public class FruitsController {

    @Autowired
    FruitsServiceImplementation fruitsServiceImplementation;

    @PutMapping
    public List<Fruits> getAllFruits(){
        return fruitsServiceImplementation.getAllFruits();
    }

    @PostMapping
    public String saveFruit(@RequestBody Fruits fruits){
        return fruitsServiceImplementation.saveFruit(fruits);
    }
}
