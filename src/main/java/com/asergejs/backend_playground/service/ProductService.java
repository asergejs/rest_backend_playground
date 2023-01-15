package com.asergejs.backend_playground.service;

import com.asergejs.backend_playground.domain.dto.ProductDTO;
import com.asergejs.backend_playground.mapper.ProductDTOMapper;
import com.asergejs.backend_playground.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getProducts() {
        return productRepository.findAll().stream()
                .map(ProductDTOMapper::toProductDTO)
                .collect(Collectors.toList());
    }
}