package com.codegym.service;

import com.codegym.model.Villa;
import com.codegym.repository.VillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VillaServiceImpl implements VillaService {
    @Autowired
    VillaRepository villaRepository;

    @Override
    public List<Villa> findAll() {
        return villaRepository.findAll();
    }

    @Override
    public void save(Villa villa) {
        villaRepository.save(villa);
    }

    @Override
    public Villa findById(Integer id) {
        return villaRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        villaRepository.deleteById(id

        );
    }
}
