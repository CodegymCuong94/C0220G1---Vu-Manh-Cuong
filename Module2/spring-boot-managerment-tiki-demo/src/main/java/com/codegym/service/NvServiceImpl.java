package com.codegym.service;

import com.codegym.model.Nv;
import com.codegym.repository.NvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NvServiceImpl implements NvService {
    @Autowired
    NvRepository nvRepository;

    @Override
    public List<Nv> findAll() {
        return nvRepository.findAll();
    }

    @Override
    public void save(Nv nv) {
        nvRepository.save(nv);
    }

    @Override
    public Nv findById(Integer id) {
        return nvRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        nvRepository.deleteById(id);
    }
}
