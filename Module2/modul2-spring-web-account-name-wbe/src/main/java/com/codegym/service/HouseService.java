package com.codegym.service;

import com.codegym.model.House;

import org.springframework.stereotype.Service;

import java.util.List;


public interface HouseService {
    //    Page<House> findAllPage(Pageable pageable);
    List<House> findAll();

    void save(House house);

    House findById(Integer id);

//    Page<House> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);
}
