package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CalculatorService;

@Controller
public class CalculatorController {
    @Autowired
    CalculatorService CalculatorService;

    @GetMapping("/calculator")
    public String result(@RequestParam("num1") String num1, @RequestParam("num2") String num2, @RequestParam("operator") String operator, Model model) {
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        double result = 0;
        switch (operator) {
            case "add":
                result = CalculatorService.add(number1, number2);
                model.addAttribute("result", result);
                return "result";
            case "sub":
                result = CalculatorService.sub(number1, number2);
                model.addAttribute("result", result);
                return "result";
            case "multi":
                result = CalculatorService.multi(number1, number2);
                model.addAttribute("result", result);
                return "result";
            case "divi":
                if (CalculatorService.divi(number1, number2).equals("đéo chia đc")) {
                    model.addAttribute("result", "đéo chia đc");
                } else {
                    result = Double.parseDouble(CalculatorService.divi(number1, number2));
                    model.addAttribute("result", result);
                    return "result";
                }
            default:
                return "result";

        }
    }

}
