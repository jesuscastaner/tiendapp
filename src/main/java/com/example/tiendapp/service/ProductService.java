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

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(int id, Product product) {
        if (repository.existsById(id)) {
            product.setId(id);
            return repository.save(product);
        } else {
            return null;
        }
    }

    public boolean deleteProduct(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}

