package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.House;

import java.util.List;

public interface CustomerService {
    //    Page<Customer> findAllPage(Pageable pageable);
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Integer id);

//    Page<Customer> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);
}
