package com.products.demo.service;

import com.products.demo.model.Product;
import com.products.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void save (Product product){
        productRepository.save(product);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Optional<Product> findById(String id){
        return productRepository.findById(id);
    }
    public void deleteById(String id) {
        productRepository.deleteById(id);
    }

}
