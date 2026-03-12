package com.inventory.saas.service;

import com.inventory.saas.entity.Company;
import com.inventory.saas.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository repository;

    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }

    public Company createCompany(Company company) {
        return repository.save(company);
    }

    public List<Company> listCompanies() {
        return repository.findAll();
    }
}