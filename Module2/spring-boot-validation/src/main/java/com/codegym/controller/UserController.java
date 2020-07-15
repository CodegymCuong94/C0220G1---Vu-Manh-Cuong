package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/list")
    public String showlist(Model model, @PageableDefault(size = 3) Pageable pageable, @RequestParam Optional<String> keyword) {


        Page<User> userList = null;
        if (!keyword.isPresent()) {
            userList = userService.findAllPage(pageable);
        } else {
            userList = userService.findByLastNameContaining(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("users", userList);
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("user", new User());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid  @ModelAttribute(value = "user") User user, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes,Model model) {
        if(bindingResult.hasFieldErrors()){
            model.addAttribute("listUser",userService.findAll());
            return "create";
        }
        userService.save(user);
        return "redirect:/list";
    }
}
