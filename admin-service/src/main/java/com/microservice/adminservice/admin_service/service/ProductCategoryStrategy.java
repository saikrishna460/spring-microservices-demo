package com.microservice.adminservice.admin_service.service;

import com.microservice.adminservice.admin_service.model.Product;

public interface ProductCategoryStrategy {
    void validateProduct(Product product);
    double addTax();
    double discountedPrice();
}
