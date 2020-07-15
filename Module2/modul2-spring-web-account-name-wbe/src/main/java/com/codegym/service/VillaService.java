package com.codegym.service;

import com.codegym.model.Villa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface VillaService {
//    Page<Villa> findAllPage(Pageable pageable);
    List<Villa> findAll();

    void save(Villa villa);

    Villa findById(Integer id);

//    Page<Villa> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);
}
