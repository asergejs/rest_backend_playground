package com.asergejs.backend_playground.domain.entity;

import com.asergejs.backend_playground.domain.model.ProductType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private ProductType type;

    @Column(name = "price")
    private BigDecimal price;
}
