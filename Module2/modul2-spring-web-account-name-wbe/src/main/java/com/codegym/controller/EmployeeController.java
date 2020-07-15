package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/listEmployee")
    public String listEmployee(Model model){
        List<Employee> listEmployee = employeeService.findAll();
        model.addAttribute("listEmployee",listEmployee);
        return "listEmployee";
    }
}
