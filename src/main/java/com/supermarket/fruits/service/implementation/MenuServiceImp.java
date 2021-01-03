package com.supermarket.fruits.service.implementation;

import com.supermarket.fruits.model.Menu;
import com.supermarket.fruits.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImp implements MenuService {

    @Autowired
    MenuRepository menuRepository;

    @Override
    public List<Menu> getAllMenu()    {return menuRepository.findAll();

    }

    @Override
    public Optional<Menu> getMenuById(String idMenu) {
        return menuRepository.findById(idMenu );
    }

    @Override
    public String saveMenu(Menu menu) {
        menuRepository. save(menu);
        return "Menu guardado";
    }
}
