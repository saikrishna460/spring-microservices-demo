package com.microservice.adminservice.admin_service.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.microservice.adminservice.admin_service.enums.ProductCategory;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_category")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "productType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ClothingProduct.class, name = "CLOTHING"),
    @JsonSubTypes.Type(value = ElectronicProduct.class, name = "ELECTRONIC")
})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String image;
    @Column(name = "product_category", insertable = false, updatable = false)
    private ProductCategory productCategory;
    private String subCategory;
    private int quantity;
    private double price;
}
