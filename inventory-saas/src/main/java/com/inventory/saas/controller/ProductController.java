package com.inventory.saas.controller;

import com.inventory.saas.entity.Product;
import com.inventory.saas.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@Tag(name = "Products", description = "Gerenciamento de produtos do estoque")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @Operation(summary = "Criar novo produto")
    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.create(product);
    }

    @Operation(summary = "Listar produtos")
    @GetMapping
    public List<Product> list() {
        return service.list();
    }
}