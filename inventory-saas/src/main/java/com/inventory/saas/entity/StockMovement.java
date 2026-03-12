package com.inventory.saas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class StockMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Integer quantity;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}