package com.itpartscompany.api.example.category.service;

import com.itpartscompany.api.example.category.model.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAllCategories();
    Optional<Category> getCategorybyId(Long id);

    void deleteCategory(Long id);

}
