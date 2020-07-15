package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.DictionaryService;

@Controller
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;

    @GetMapping("/dictionary")
    public String translate(@RequestParam("english") String english, Model model) {
        String vietnam = dictionaryService.findByEnglish(english);
        model.addAttribute("vietnam", vietnam);
        return "result";
    }
}
