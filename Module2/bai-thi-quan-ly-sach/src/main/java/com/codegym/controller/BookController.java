package com.codegym.controller;

import com.codegym.model.Book;
import com.codegym.service.BookService;
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

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/list")
    public String goList(Model model) {
//        Page<Book> bookList =null;
//        if (!keyword.isPresent()) {
//            bookList = bookService.findAll(pageable);
//        } else {
//            bookList = bookService.findByName(keyword.get(), pageable);
//            model.addAttribute("keyword", keyword.get());
//        }
        List<Book>bookList=bookService.findAll();
        model.addAttribute("bookList", bookList);

        return "list";
    }

    @GetMapping("/list1")
    public String goList1(Model model, @PageableDefault(size = 20)Pageable pageable,@RequestParam Optional<Integer> keyword) {
        Page<Book> bookList =null;
        if (!keyword.isPresent()) {
            bookList = bookService.findAll(pageable);
        } else {
            bookList = bookService.findById(keyword.get(), pageable);
            model.addAttribute("keyword", keyword.get());
        }
        model.addAttribute("bookList", bookList);

        return "list1";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("book", new Book());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "book") Book book, Model model) {
        bookService.save(book);
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "list";
    }

    @GetMapping("/edit")

    public String goEdit(@RequestParam Integer id, Model model) {

        model.addAttribute("book", bookService.findById(id));

        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute Book book, BindingResult bindingResult, Model model) {
        new Book().validate(book, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("bookList", bookService.findAll());
            return "create";
        } else {
            bookService.save(book);
            return "redirect:/list";
        }
    }



}
