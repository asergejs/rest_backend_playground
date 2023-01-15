package com.asergejs.backend_playground.repository;

import com.asergejs.backend_playground.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
