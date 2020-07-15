package com.codegym.service;

import com.codegym.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    Page<User> findAllPage(Pageable pageable);
    List<User>findAll();

    void save(User user);

    User findById(Integer id);

    Page<User> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);

}
