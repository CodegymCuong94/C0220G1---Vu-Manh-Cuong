package com.codegyn.service;

import com.codegyn.model.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NhanVienService {
    List<NhanVien> findAll();

    void save(NhanVien nhanVien);

    NhanVien findById(Integer id);

//    Page<NhanVien> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);
}
