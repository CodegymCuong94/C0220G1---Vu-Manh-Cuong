package com.codegym.repository;

import com.codegym.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElementRepository extends JpaRepository<Element, Integer> {
}
