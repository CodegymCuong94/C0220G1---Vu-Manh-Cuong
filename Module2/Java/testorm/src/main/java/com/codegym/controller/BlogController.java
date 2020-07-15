package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/list")
    public String showList(Model model) {
        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogs", blogList);
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("blogs", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "blogs") Blog blog,
                         RedirectAttributes redirectAttributes, Model model) {
        blog.setId((int) (Math.random() * 1000));

        blogService.save(blog);


        List<Blog> blogList = blogService.findAll();
        model.addAttribute("blogs", blogList);
        return "list";
    }
}
