package com.tnisf.Spring_Data_JPA_Mapping.repository;

import com.javatechie.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
