package com.microservice.adminservice.admin_service.service;

import com.microservice.adminservice.admin_service.factorypattern.ProductFactory;
import com.microservice.adminservice.admin_service.model.Product;
import com.microservice.adminservice.admin_service.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;
    ProductFactory productFactory;

    public ProductService(ProductRepository productRepository,ProductFactory productFactory ) {
        this.productRepository = productRepository;
        this.productFactory = productFactory;
    }

    public String addProduct(Product product){
        System.out.println("In Service");
        ProductCategoryStrategy productCategoryStrategy = productFactory.getStrategy(product.getProductCategory());

        if(productCategoryStrategy != null){
            System.out.println("In Strategy");
            productCategoryStrategy.validateProduct(product);
        }

        productRepository.save(product);
        return "added Successfully";
    }
}
