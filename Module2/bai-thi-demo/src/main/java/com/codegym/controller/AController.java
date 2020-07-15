package com.codegym.controller;

import com.codegym.model.A;
import com.codegym.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AController {
    @Autowired
    AService aService;

    @GetMapping("/view")
    public String goView(Model model) {
        List<A> aList = aService.findAll();
        model.addAttribute("aList", aList);
        return "view";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("a", new A());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "a") A a) {
        aService.save(a);
        return "redirect:/view";
    }
}
