package com.products.demo.controller;

import com.products.demo.model.Product;
import com.products.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/products")
    public void save(@RequestBody Product product){
        productService.save(product);
    }
    @GetMapping("/products")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable String id) {
        return productService.findById(id).get();
    }

    @DeleteMapping("/produt/{id}")
    public void deleteById(@PathVariable String id) {
        productService.deleteById(id);
    }

    public void update (@RequestBody Product product) {
        productService.save(product);
    }
}
