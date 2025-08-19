package com.example.InventoryManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<ProductController> getAllProducts() {
        return productService.findAll();
    }
    
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }
}
