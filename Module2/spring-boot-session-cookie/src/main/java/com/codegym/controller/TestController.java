//package com.codegym.controller;
//
//import com.codegym.model.Test;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//
//@Controller
//@SessionAttributes("checkSession")
//public class TestController {
//
//
//    @GetMapping("/test")
//    public String test(Model model, @CookieValue(value="cookieName",defaultValue = "")String testCookieName) {
//        model.addAttribute("checkSession", new Test(testCookieName));
//        return "test";
//    }
//
//    @PostMapping("/checkSession")
//    public String checkSession(@ModelAttribute("checkSession") Test test, HttpServletResponse response) {
//        Cookie cookieName = new Cookie("cookieName", test.getName());
//        response.addCookie(cookieName);
//        return "redirect:/list";
//    }
//}
