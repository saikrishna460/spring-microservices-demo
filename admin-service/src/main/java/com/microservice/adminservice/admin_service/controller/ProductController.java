package com.microservice.adminservice.admin_service.controller;

import com.microservice.adminservice.admin_service.model.Product;
import com.microservice.adminservice.admin_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody Product product){
        System.out.println("In Controller");
        return ResponseEntity.ok(productService.addProduct(product));
    }
}
