package com.asergejs.backend_playground.domain.dto;

import com.asergejs.backend_playground.domain.entity.Product;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("products")
    private List<Product> products;

}
