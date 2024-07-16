package com.itpartscompany.api.example.product.controller;

import com.itpartscompany.api.example.product.model.Product;
import com.itpartscompany.api.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/products")
public class ProductControllerImpl implements ProductController{

    @Autowired
    private ProductService productService;

    @Override
    @GetMapping({"","/"})
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @Override
    @GetMapping("/{uuid}")
    public ResponseEntity<Product> getProductById(@PathVariable String uuid) {
        Optional<Product> productOptional = productService.getProductById(uuid);
        //se crea un opcional vacio para guardar el POSIBLE resultado, es una manera de control, como una excepcion
        if (productOptional.isPresent()){
            return ResponseEntity.ok(productOptional.get());
        }else return ResponseEntity.notFound().build();
    }

    @Override
    @DeleteMapping("/{uuid}")
    public ResponseEntity<Void> deleteById(@PathVariable String uuid) {
        productService.deleteById(uuid);
        return ResponseEntity.noContent().build();
    }

}
