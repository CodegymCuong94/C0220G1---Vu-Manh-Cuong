package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index() {
        return "redirect:/list";
    }


    @GetMapping("/list")
    public String showList(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "list";
    }
    @GetMapping("/amount")
    public String amount(Model model, @RequestParam Integer amount, @RequestParam Integer id){

    }

}