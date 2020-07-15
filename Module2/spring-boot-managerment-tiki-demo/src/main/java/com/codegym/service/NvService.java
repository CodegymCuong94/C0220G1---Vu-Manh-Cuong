package com.codegym.service;


import com.codegym.model.Nv;

import java.util.List;

public interface NvService {

    List<Nv> findAll();

    void save(Nv member);

    Nv findById(Integer id);


    void deleteById(Integer id);
}
