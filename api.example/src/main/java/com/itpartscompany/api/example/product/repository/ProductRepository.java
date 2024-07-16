package com.itpartscompany.api.example.product.repository;


import com.itpartscompany.api.example.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    //El findbyCategory pendiente

}
