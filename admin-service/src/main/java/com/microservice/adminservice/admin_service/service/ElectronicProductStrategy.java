package com.microservice.adminservice.admin_service.service;

import com.microservice.adminservice.admin_service.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ElectronicProductStrategy implements ProductCategoryStrategy{

    @Override
    public void validateProduct(Product product) {
        if(product.getQuantity() < 0){
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        System.out.println("In validation");
        product.setPrice(product.getPrice()* addTax());
    }

    @Override
    public double addTax() {
        return 2;
    }

    @Override
    public double discountedPrice() {
        return 0;
    }
}
