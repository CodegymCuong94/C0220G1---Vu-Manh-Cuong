package com.codegym.service;

import com.codegym.model.House;
import com.codegym.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    HouseRepository houseRepository;

    @Override
    public List<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public void save(House house) {
        houseRepository.save(house);
    }

    @Override
    public House findById(Integer id) {
        return houseRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        houseRepository.deleteById(id);
    }
}
