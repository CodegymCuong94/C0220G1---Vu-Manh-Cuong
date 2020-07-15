package com.codegym.service;

import com.codegym.model.Element;

import java.util.List;

public interface ElementService {

    List<Element> findAll();

    void save(Element element);

    Element findById(Integer id);

    void deleteById(Integer id);
}
