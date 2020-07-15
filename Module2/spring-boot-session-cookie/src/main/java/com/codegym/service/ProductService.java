package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

//    void save(Product product);
//
    Product findById(Integer id);
//
//    void deleteById(Integer id);

//    Long getTotalProduct(Long price, Long amount);
}
