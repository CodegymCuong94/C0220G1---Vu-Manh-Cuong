package com.codegyn.service;

import com.codegyn.model.NhanVien;
import com.codegyn.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    @Autowired
    NhanVienRepository nhanVienRepository;

    @Override
    public List<NhanVien> findAll() {
        return nhanVienRepository.findAll();
    }

    @Override
    public void save(NhanVien nhanVien) {
        nhanVienRepository.save(nhanVien);
    }

    @Override
    public NhanVien findById(Integer id) {
        return nhanVienRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        nhanVienRepository.deleteById(id);
    }
}
