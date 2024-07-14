package com.itpartscompany.api.example.category.controller;

import com.itpartscompany.api.example.category.model.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

//Esta clase prepara el json que llega al ordenador cliente

public interface CategoryController {

    ResponseEntity<List<Category>> getAllCategories();
    ResponseEntity<Category> getCategorybyId(Long id);

    ResponseEntity<Void> deleteCategory(Long id);

}
