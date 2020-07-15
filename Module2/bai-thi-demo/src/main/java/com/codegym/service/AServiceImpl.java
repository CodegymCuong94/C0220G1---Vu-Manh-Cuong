package com.codegym.service;

import com.codegym.model.A;
import com.codegym.repository.ARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AServiceImpl implements AService {
    @Autowired
    ARepository aRepository;

    @Override
    public List<A> findAll() {
        return aRepository.findAll();
    }

    @Override
    public void save(A a) {
        aRepository.save(a);
    }

    @Override
    public A findById(Integer id) {
        return aRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        aRepository.deleteById(id);
    }
}
