package com.inventory.saas.controller;

import com.inventory.saas.entity.StockMovement;
import com.inventory.saas.service.StockMovementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movements")
@Tag(name = "Stock Movements", description = "Registro de movimentações de estoque")
public class StockMovementController {

    private final StockMovementService service;

    public StockMovementController(StockMovementService service) {
        this.service = service;
    }

    @Operation(summary = "Registrar movimentação de estoque")
    @PostMapping
    public StockMovement create(@RequestBody StockMovement movement) {
        return service.create(movement);
    }

    @Operation(summary = "Listar movimentações de estoque")
    @GetMapping
    public List<StockMovement> list() {
        return service.list();
    }
}