package com.abdelkhalek.product.model.entity;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Data
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder(toBuilder = true)
public abstract class AbstractEntity {

    @Id
    protected UUID id;
}


