package com.example.InventoryManagement.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Supplier {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String contactEmail;
    
    @OneToMany(mappedBy = "supplier")
    private List<Product> suppliedProducts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public List<Product> getSuppliedProducts() {
		return suppliedProducts;
	}

	public void setSuppliedProducts(List<Product> suppliedProducts) {
		this.suppliedProducts = suppliedProducts;
	}
}
