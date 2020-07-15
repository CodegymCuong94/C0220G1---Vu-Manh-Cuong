package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.SandwichService;

import java.util.Arrays;

@Controller
public class SandwichController {

    @Autowired
    SandwichService SandwichService;

    @GetMapping("/sandwichController")
    public String save(@RequestParam("spices") String[] spices, Model model) {
        String[] show = SandwichService.saveSpice(spices);
//        Arrays.toString để in mảng ra dưới dạng String
//        model.addAttribute để truyền dữ liệu qua result
        model.addAttribute("show", Arrays.toString(show));
        return "result";
    }
}
