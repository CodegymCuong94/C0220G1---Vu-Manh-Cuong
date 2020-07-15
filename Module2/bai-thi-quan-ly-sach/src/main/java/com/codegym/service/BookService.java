package com.codegym.service;

import com.codegym.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Page<Book> findAll(Pageable pageable);

    void save(Book book);

    Book findById(Integer id);


    void deleteById(Integer id);
    Page<Book> findByName(String keyword, Pageable pageable);
    Page<Book> findById(Integer keyword, Pageable pageable);
}
