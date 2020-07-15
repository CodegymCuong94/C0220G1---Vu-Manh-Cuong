package com.codegym.service;

import com.codegym.model.A;

import java.util.List;

public interface AService {
    List<A> findAll();

    void save(A a);

    A findById(Integer id);


    void deleteById(Integer id);
}
