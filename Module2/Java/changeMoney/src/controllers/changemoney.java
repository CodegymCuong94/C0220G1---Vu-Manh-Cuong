package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class changemoney {
    @GetMapping("/changemoney")
    //Nhan gia tri tu WEB-INF/index
    public String changeMoney(@RequestParam String usd, @RequestParam String rate, Model model) {
        float usdFloat = Float.parseFloat(usd);
        float rateFloat = Float.parseFloat(rate);
        float vnd = usdFloat * rateFloat;
        //Gan gia tri chuyen qua views/index
        model.addAttribute("usdfloat", usdFloat);
        model.addAttribute("rateFloat", rateFloat);
        model.addAttribute("vnd", vnd);
        //Tra gia tri ve views/index
        return "index";
    }
}
