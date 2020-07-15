package com.codegym.controller;

import com.codegym.model.House;
import com.codegym.model.Room;
import com.codegym.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HouseController {
    @Autowired
    HouseService houseService;
    @GetMapping("/listHouse")
    public String goListRoom(Model model) {
        List<House> listHouse = houseService.findAll();
        model.addAttribute("houses", listHouse);
        return "listHouse";
    }
}
