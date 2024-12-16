package com.example.tiendapp.service;

import com.example.tiendapp.model.Product;
import com.example.tiendapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product getProductById(int productId) {
        return repository.findById(productId).orElse(new Product());
    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public void updateProduct(Product product) {
        repository.save(product);
    }

    public void deleteProduct(int productId) {
        repository.deleteById(productId);
    }
}

