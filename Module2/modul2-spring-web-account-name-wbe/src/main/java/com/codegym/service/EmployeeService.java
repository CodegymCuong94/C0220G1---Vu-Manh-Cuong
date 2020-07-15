package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Employee;

import java.util.List;

public interface EmployeeService {
    //    Page<Employee> findAllPage(Pageable pageable);
    List<Employee> findAll();

    void save(Employee employee);

    Employee findById(Integer id);

//    Page<Employee> findByLastNameContaining(String keyword, Pageable pageable);

    void deleteById(Integer id);
}
