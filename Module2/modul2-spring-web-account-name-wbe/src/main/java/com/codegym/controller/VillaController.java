package com.codegym.controller;

import com.codegym.model.Villa;
import com.codegym.service.VillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VillaController {
    @Autowired
    VillaService villaService;

    @GetMapping("/")
    public String listVilla(Model model) {
        List<Villa> listVilla = villaService.findAll();
        model.addAttribute("villas",listVilla);
        return "test";
    }
}
