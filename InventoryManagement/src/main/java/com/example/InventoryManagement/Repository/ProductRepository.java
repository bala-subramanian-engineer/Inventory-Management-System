package com.example.InventoryManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InventoryManagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByStockQuantityLessThan(int threshold);
}


