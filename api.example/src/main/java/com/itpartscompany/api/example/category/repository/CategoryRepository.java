package com.itpartscompany.api.example.category.repository;

//Las clases de repository son el intermediario entre la entidad que representa el objeto de la abse de datos y la bbdd

import com.itpartscompany.api.example.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> /*parametros usados para la bbdd (categoria y la PK, id en este caso)*/{

    //findall te saca  to_do de esa base de datos
    //findbyid es la que le pases como parametro (id)


}
