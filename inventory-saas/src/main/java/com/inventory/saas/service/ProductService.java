package com.inventory.saas.service;

import com.inventory.saas.entity.Product;
import com.inventory.saas.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product product) {
        return repository.save(product);
    }

    public List<Product> list() {
        return repository.findAll();
    }
}