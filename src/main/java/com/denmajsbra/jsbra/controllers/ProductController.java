package com.denmajsbra.jsbra.controllers;

import com.denmajsbra.jsbra.entities.Product;
import com.denmajsbra.jsbra.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") String id){
        Optional<Product> p = productRepository.findById(id);
        return ResponseEntity.ok(p.orElse(null));
    }

    @PostMapping(value = "products", consumes = "application/json")
    public ResponseEntity<Product> save(@RequestBody Product p){
        Product product = productRepository.save(p);
        return ResponseEntity.ok(product);
    }

}
