package com.itpartscompany.api.example.product.controller;

import com.itpartscompany.api.example.product.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ProductController {

    ResponseEntity<List<Product>> getAllProducts();
    ResponseEntity<Product> getProductById(String uuid);

    ResponseEntity<Void> deleteById(String uuid);

}
