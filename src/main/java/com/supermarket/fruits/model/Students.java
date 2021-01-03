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

public class Students {

   private String nombreEstudiante;
   private String apellidoEstudiante;
   @Id
   private String idEstudiante;

}
