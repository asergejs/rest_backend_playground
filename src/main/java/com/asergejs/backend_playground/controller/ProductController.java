package com.asergejs.backend_playground.controller;

import com.asergejs.backend_playground.domain.dto.ProductDTO;
import com.asergejs.backend_playground.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<ProductDTO> getProducts() {
        return productService.getProducts();
    }
}