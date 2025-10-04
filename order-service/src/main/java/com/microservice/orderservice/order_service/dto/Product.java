package com.microservice.orderservice.order_service.dto;

import com.microservice.orderservice.order_service.enums.ProductCategory;
import com.microservice.orderservice.order_service.enums.ProductSize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product{
    private int productId;
    private ProductCategory productCategory;
    private String productName;
    private String productDescription;
    private double productPrice;
    private int productQuantity;
    private String productImage;
    private ProductSize productSize;
}
