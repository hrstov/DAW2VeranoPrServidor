package com.itpartscompany.api.example.product.service;

import com.itpartscompany.api.example.product.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductService {

    List<Product> getAllProducts();
    Optional<Product> getProductById(String uuid);

    void deleteById(String uuid);


}
