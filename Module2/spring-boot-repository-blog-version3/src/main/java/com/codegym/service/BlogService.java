package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    void save(Blog blog);
    Blog findById(int id);
    Page<Blog> findByTextContaining(String keyword, Pageable pageable);
}
