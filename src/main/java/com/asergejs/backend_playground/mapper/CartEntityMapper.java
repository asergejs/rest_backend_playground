package com.asergejs.backend_playground.mapper;

import com.asergejs.backend_playground.domain.dto.CartDTO;
import com.asergejs.backend_playground.domain.entity.Cart;

public class CartEntityMapper {

    public static Cart toCartEntity(CartDTO dto) {
        Cart entity = new Cart();
        entity.setId(dto.getId());
        entity.setProducts(dto.getProducts());
        return entity;
    }

}