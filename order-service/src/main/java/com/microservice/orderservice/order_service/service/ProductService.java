package com.microservice.orderservice.order_service.service;

import com.microservice.orderservice.order_service.dto.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    Product addProduct(Product product);
    Product addAllProduct(List<Product> products);
    Product updateProduct(Product product);
    void deleteProduct(int productId);

    List<Product> getAllProducts();
    Product getProductById(int productId);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByCategoryAndSize(String Category, String size);
}
