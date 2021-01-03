package com.supermarket.fruits.service.implementation;

import com.supermarket.fruits.model.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService
{

    List<Menu> getAllMenu( );

    Optional<Menu> getMenuById (String idMenu);

    String saveMenu (Menu menu);

}
