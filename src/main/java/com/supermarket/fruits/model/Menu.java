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
private String idMenu;
private String dayMenu;
private String priceMenu;

}
