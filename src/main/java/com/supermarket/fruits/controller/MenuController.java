package com.supermarket.fruits.controller;


import com.supermarket.fruits.model.Menu;
import com.supermarket.fruits.service.implementation.MenuServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("menu")


public class MenuController {

    @Autowired
    MenuServiceImp menuServiceImp;

    @GetMapping ("/getall")
    public List<Menu> getAllMenu( ){
         return menuServiceImp.getAllMenu();
    }

    @PostMapping ("/save")
    public String saveMenu(@RequestBody Menu menu){
        return menuServiceImp.saveMenu(menu);
    }

    @GetMapping ("/{idMenu}")
    public Optional<Menu> getMenuById (@PathVariable String idMenu){
        return menuServiceImp.getMenuById(idMenu);
    }

}
