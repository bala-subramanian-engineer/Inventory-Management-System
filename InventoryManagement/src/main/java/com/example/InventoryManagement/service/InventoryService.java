package com.example.InventoryManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.InventoryManagement.Repository.ProductRepository;
import com.example.InventoryManagement.entity.Product;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final ProductRepository productRepo = null;
    
    public List<Product> getLowStockItems(int threshold) {
        return productRepo.findByStockQuantityLessThan(threshold);
    }
    
    @Transactional
    public void updateStock(Long productId, int quantityChange) {
        Product product = productRepo.findById(productId)
            .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setStockQuantity(product.getStockQuantity() + quantityChange);
    }
}