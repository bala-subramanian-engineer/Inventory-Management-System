package com.example.InventoryManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.InventoryManagement.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
