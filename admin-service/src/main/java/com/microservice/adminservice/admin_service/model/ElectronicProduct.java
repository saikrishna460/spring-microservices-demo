package com.microservice.adminservice.admin_service.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@DiscriminatorValue("ELECTRONIC")
@Data
@Entity
public class ElectronicProduct extends Product{
    private double weight;
    private int powerCapacity;
    private String brandName;
    private String warranty;
}
