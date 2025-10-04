package com.microservice.orderservice.order_service.controller;

import com.microservice.orderservice.order_service.dto.Product;
import com.microservice.orderservice.order_service.enums.ProductCategory;
import com.microservice.orderservice.order_service.enums.ProductSize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping("/getProduct")
    public List<Product> getAllProducts(){
        return List.of(
                new Product(1, ProductCategory.ELECTRONICS, "Laptop", "High-performance laptop", 999.99, 10, "laptop.jpg", ProductSize.SMALL),
                new Product(2, ProductCategory.ELECTRONICS, "Smartphone", "Latest smartphone model", 799.99, 20, "smartphone.jpg", ProductSize.MEDIUM),
                new Product(3, ProductCategory.ELECTRONICS, "Headphones", "Wireless headphones", 149.99, 30, "headphones.jpg", ProductSize.SMALL),
                new Product(4, ProductCategory.ELECTRONICS, "Tablet", "Portable tablet", 299.99, 15, "tablet.jpg", ProductSize.MEDIUM),
                new Product(5, ProductCategory.ELECTRONICS, "Smartwatch", "Fitness tracker", 199.99, 25, "smartwatch.jpg", ProductSize.SMALL),
                new Product(6, ProductCategory.ELECTRONICS, "Camera", "Digital camera", 599.99, 8, "camera.jpg", ProductSize.MEDIUM),
                new Product(7, ProductCategory.ELECTRONICS, "Gaming Console", "Next-gen gaming console", 499.99, 12, "gaming_console.jpg", ProductSize.LARGE),
                new Product(8, ProductCategory.CLOTHING, "T-Shirt", "T-Shirt", 129.99, 18, "Tshirt.jpg", ProductSize.MEDIUM),
                new Product(8, ProductCategory.CLOTHING, "T-Shirt", "T-Shirt", 139.99, 20, "Tshirt.jpg", ProductSize.LARGE),
                new Product(9, ProductCategory.CLOTHING, "Shirt", "Shirt", 89.99, 22, "Shirt.jpg", ProductSize.LARGE),
                new Product(10, ProductCategory.CLOTHING, "Shoe", "Shoe", 79.99, 28, "Shoe.jpg", ProductSize.SMALL),
                new Product(10, ProductCategory.CLOTHING, "Shoe", "Shoe", 79.99, 28, "Shoe.jpg", ProductSize.LARGE)
        );
    }

    @PostMapping(value = "/addProducts")
    public String addProducts(@RequestBody Product product){
        System.out.println(product);
        return "added";
    }
}
