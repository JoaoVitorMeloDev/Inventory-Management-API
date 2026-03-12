package com.inventory.saas.service;

import com.inventory.saas.entity.StockMovement;
import com.inventory.saas.repository.StockMovementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockMovementService {

    private final StockMovementRepository repository;

    public StockMovementService(StockMovementRepository repository) {
        this.repository = repository;
    }

    public StockMovement create(StockMovement movement) {
        return repository.save(movement);
    }

    public List<StockMovement> list() {
        return repository.findAll();
    }
}