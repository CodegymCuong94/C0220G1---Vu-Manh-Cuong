package com.codegym.service;

import com.codegym.model.Element;
import com.codegym.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ElementServiceImpl implements ElementService {
    @Autowired
    ElementRepository elementRepository;
    @Override
    public List<Element> findAll() {
        return ElementRepository.fi
    }

    @Override
    public void save(Element element) {

    }

    @Override
    public Element findById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
