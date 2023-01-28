package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.ProductDTO;
import com.asergejs.backend_playground.domain.entity.Product;

public class ProductDTOMapper {


    public static ProductDTO toProductDTO(Product product) {
        var productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(productDTO.getName());
//        productDTO.setType(product.getType());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

}
