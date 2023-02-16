package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.CartDTO;
import com.asergejs.backend_playground.domain.entity.Cart;

public class CartDTOMapper {

    public static CartDTO toCartDTO(Cart entity) {
        CartDTO dto = new CartDTO();
        dto.setId(entity.getId());
        dto.setProducts(entity.getProducts());
        return dto;
    }
}