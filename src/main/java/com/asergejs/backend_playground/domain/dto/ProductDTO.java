package com.asergejs.backend_playground.domain.dto;

import com.asergejs.backend_playground.domain.model.ProductType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private ProductType type;

    @JsonProperty("price")
    private BigDecimal price;

}
