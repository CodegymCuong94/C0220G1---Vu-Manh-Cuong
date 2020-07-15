package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;


    @GetMapping("/createCustomer")
    public String goCreateCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "createCustomer";
    }

    @PostMapping("/createCustomer")
    public String createCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "test";
    }
//
//    @GetMapping("/listCustomer")
//    public String listCustomer(Model model) {
//        List<Customer> listCustomer = customerService.findAll();
//        model.addAttribute("listCustomer", listCustomer);
//        return "/listCustomer";
//    }

    @GetMapping("/listCustomer")
    public ModelAndView listCustomer() {
        return new ModelAndView("listCustomer","listCustomer", customerService.findAll());
    }

}
