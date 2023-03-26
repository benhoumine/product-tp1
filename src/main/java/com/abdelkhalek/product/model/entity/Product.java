package com.abdelkhalek.product.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity(name="product")
@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Product extends AbstractEntity {
    @Column(nullable = false)
    private String name;
    private Long price;

}
