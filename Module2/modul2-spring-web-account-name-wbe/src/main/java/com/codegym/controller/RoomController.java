package com.codegym.controller;

import com.codegym.model.Room;
import com.codegym.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/listRoom")
    public String goListRoom(Model model) {
        List<Room> listRoom = roomService.findAll();
        model.addAttribute("rooms", listRoom);
        return "listRoom";
    }


}
