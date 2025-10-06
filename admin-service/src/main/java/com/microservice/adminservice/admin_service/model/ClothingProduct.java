package com.microservice.adminservice.admin_service.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("CLOTHING")
public class ClothingProduct extends Product{
    private String fabricType;
    private String size;
    private String color;
}
