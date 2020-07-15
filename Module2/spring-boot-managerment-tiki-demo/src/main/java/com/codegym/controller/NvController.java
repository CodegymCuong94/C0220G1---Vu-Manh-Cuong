package com.codegym.controller;

import com.codegym.model.Nv;
import com.codegym.service.NvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NvController {
    @Autowired
    NvService nvService;

    @GetMapping("views")
    public String go(Model model) {
        List<Nv> nvList = nvService.findAll();
        model.addAttribute("nvList", nvList);
        return "views";
    }

    @GetMapping("/delete")
    public String goDelete(@RequestParam Integer id) {
        nvService.deleteById(id);
        return "redirect:/views";
    }

    @GetMapping("/edit")
    public String goEdit(@RequestParam Integer id, Model model) {
        model.addAttribute("nv", nvService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Nv nv) {
        nvService.save(nv);
        return "redirect:/views";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("nv", new Nv());
        return "create";
    }

    @PostMapping("/create")
    public String CreateNv(@Valid @ModelAttribute(value = "nv") Nv nv, BindingResult bindingResult, Model model) {
        new Nv().validate(nv, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("nvList", nvService.findAll());
            return "create";
        }
        nvService.save(nv);
        return "redirect:/views";
    }

    @GetMapping("/ds")
    public String showDs() {
        return "ds";
    }

    @GetMapping("/tao")
    public String showTao() {
        return "tao";
    }

}


