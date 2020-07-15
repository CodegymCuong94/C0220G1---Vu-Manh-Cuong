package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BlogRepository {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(int id);
//    void update(int id, Blog blog);
//    void remove(int id);
}
