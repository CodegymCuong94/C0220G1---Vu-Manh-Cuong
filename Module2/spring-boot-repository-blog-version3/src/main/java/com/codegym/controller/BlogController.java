package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/list")
    public String showList(Model model, @PageableDefault(size = 2)Pageable pageable, @RequestParam Optional<String> keyword) {
//        Page<Blog> blogList = blogService.findAll(pageable);
//        model.addAttribute("blogs", blogList);

            Page<Blog> blogList = null;
        if (!keyword.isPresent()) {
            blogList = blogService.findAll(pageable);
        } else {
            blogList = blogService.findByTextContaining(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("blogs", blogList);
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("blog", new Blog());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "blog") Blog blog,
                         RedirectAttributes redirectAttributes) {

        blogService.save(blog);
//        redirectAttributes.addFlashAttribute("message", "Register successfully!");

        return "redirect:/list";
    }
}
