package com.amorna.boutique.repository;

import com.amorna.boutique.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
