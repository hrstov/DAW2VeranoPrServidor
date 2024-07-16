package com.itpartscompany.api.example.product.model;


import com.itpartscompany.api.example.category.model.Category;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity //Entidad de SpringBoot dice que es un objeto de la bbdd (la de abajo no seria necesaria porque todos los nombres coinciden
// esta hace el trabajo pero por si acaso)
@Table (name = "category") //Anotacion para asegurar que coinciden los atributos con las entidades (referencia explicita)
@Getter //Entidades de lombok
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private UUID id;
    private String name;
    private String description;
    private Category category;

}
