package com.example.tiendapp.repository;

import com.example.tiendapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//JpaRepository<Entidad, PrimaryKey>
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
