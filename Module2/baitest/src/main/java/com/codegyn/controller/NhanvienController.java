package com.codegyn.controller;

import com.codegyn.model.NhanVien;
import com.codegyn.service.NhanVienService;
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
public class NhanvienController {
    @Autowired
    NhanVienService nhanvienService;
    @GetMapping("/view")
    public String go(Model model) {
        List<NhanVien> nhanVienList=nhanvienService.findAll();
        model.addAttribute("nhanVienList",nhanVienList);
        return "view";
    }
    @GetMapping("/delete")
    public String goDelete(@RequestParam Integer id) {
        nhanvienService.deleteById(id);
        return "redirect:/view";
    }
    @GetMapping("/create" )
    public String goCreate(Model model){
        model.addAttribute("nhanVien",new NhanVien());
        return "create";
    }
    @PostMapping("/create")
    public String CreateNhanVien(@Valid @ModelAttribute(value = "nhanVien") NhanVien nhanVien, BindingResult bindingResult, Model model) {
        new NhanVien().validate(nhanVien, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("nhanVienList", nhanvienService.findAll());
            return "create";
        }
        nhanvienService.save(nhanVien);
        return "redirect:/view";
    }

}
