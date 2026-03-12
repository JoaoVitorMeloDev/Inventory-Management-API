package com.inventory.saas.controller;

import com.inventory.saas.entity.Company;
import com.inventory.saas.service.CompanyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
@Tag(name = "Companies", description = "Gerenciamento de empresas do SaaS")
public class CompanyController {

    private final CompanyService service;

    public CompanyController(CompanyService service) {
        this.service = service;
    }

    @Operation(summary = "Criar nova empresa")
    @PostMapping
    public Company create(@RequestBody Company company) {
        return service.createCompany(company);
    }

    @Operation(summary = "Listar empresas")
    @GetMapping
    public List<Company> list() {
        return service.listCompanies();
    }
}