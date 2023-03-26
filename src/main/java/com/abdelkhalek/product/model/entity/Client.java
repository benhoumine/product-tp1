package com.abdelkhalek.product.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity(name="client")
@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
public class Client extends AbstractEntity{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String mail;
}
