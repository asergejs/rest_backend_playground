package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.ProductDTO;
import com.asergejs.backend_playground.domain.entity.Product;

public class ProductEntityMapper {

    public static Product toProductEntity(ProductDTO productDTO) {
        var product = new Product();
        product.setId(product.getId());
        product.setName(productDTO.getName());
        product.setType(productDTO.getType());
        product.setPrice(product.getPrice());
        return product;
    }

}
