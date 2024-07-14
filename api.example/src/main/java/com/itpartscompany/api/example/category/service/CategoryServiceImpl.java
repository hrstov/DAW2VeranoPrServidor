package com.itpartscompany.api.example.category.service;


/*Impl --> Implementation*/

import com.itpartscompany.api.example.category.model.Category;
import com.itpartscompany.api.example.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class CategoryServiceImpl implements CategoryService{

    //aqui tengo que meter el repositorio (JpaRepository) metiendo los metodos con inyeccion de independencias (de springboot)
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<Category> getAllCategories() {

        return categoryRepository.findAll();
        
    }

    @Override
    public Optional<Category> getCategorybyId(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }


}
