package com.microservice.adminservice.admin_service.factorypattern;

import com.microservice.adminservice.admin_service.enums.ProductCategory;
import com.microservice.adminservice.admin_service.service.ClothingProductStrategy;
import com.microservice.adminservice.admin_service.service.ElectronicProductStrategy;
import com.microservice.adminservice.admin_service.service.ProductCategoryStrategy;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

@Component
public class ProductFactory {
    private final Map<ProductCategory, ProductCategoryStrategy> strategies = new EnumMap<>(ProductCategory.class);

    public ProductFactory(
            ElectronicProductStrategy electronicsStrategy,
            ClothingProductStrategy clothingStrategy
    ) {
        strategies.put(ProductCategory.ELECTRONIC, electronicsStrategy);
        strategies.put(ProductCategory.CLOTHING, clothingStrategy);
        System.out.println(strategies);
    }

    public ProductCategoryStrategy getStrategy(ProductCategory category) {
        return strategies.get(category);
    }
}
