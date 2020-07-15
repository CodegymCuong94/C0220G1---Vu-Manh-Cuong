package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
//@SessionAttributes("checkSession")
public class ProductController {
    @Autowired
    ProductService productService;
//    @GetMapping("/")
//    public String index() {
//        return "redirect:/test";
//    }


    @GetMapping("/list")
    public String showList(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "list";
    }



}
