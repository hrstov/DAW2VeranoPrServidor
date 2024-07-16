package com.itpartscompany.api.example.category.controller;


import com.itpartscompany.api.example.category.model.Category;
import com.itpartscompany.api.example.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategoryControllerImpl implements CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Override
    @GetMapping({"","/"})
    /*("/getAll")*///igual que localhost:8080/api/categories/...(---getAll---)
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @Override
    @GetMapping("/{id}")//las llaves indican la variable que le pasamos como parametro NOMBRE DEBE COINCIDIR
    //EJ localhost:8080/api/categories/5.  El 5 convierte el del parametro del metodo de abajo
    public ResponseEntity<Category> getCategorybyId(@PathVariable/*esto se asegura de que lo de arriba se hace*/ Long id) {
        Optional<Category> categoryOpt = categoryService.getCategorybyId(id);

        if (categoryOpt.isPresent()){
            Category category = categoryOpt.get();
            return ResponseEntity.ok(category);
        }else return ResponseEntity.notFound().build();
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ResponseEntity.noContent().build();
    }

/*
* "id": 5,
    "name": "Storage Drives",
    "description": "Hard drives and SSDs for data storage in computers."*/
}
