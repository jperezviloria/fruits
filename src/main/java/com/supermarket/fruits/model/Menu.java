package com.supermarket.fruits.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document


public class Menu {

@Id
private String IdMenu;
private String DayMenu;
private String PriceMenu;


    public Menu() {
    }
}
