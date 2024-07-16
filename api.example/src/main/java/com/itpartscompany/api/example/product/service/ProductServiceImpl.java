package com.itpartscompany.api.example.product.service;

import com.itpartscompany.api.example.product.model.Product;
import com.itpartscompany.api.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(String uuid) {
        return productRepository.findById(uuid);
    }

    @Override
    public void deleteById(String uuid) {
        productRepository.deleteById(uuid);
    }
}
