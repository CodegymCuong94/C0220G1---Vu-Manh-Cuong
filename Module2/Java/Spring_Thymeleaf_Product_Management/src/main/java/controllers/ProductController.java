package controllers;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "list";
    }

    @GetMapping("/create")
    public String goCreate(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute(value = "product") Product product,
                         RedirectAttributes redirectAttributes, Model model) {
        product.setId((int) (Math.random() * 1000));

        productService.save(product);

//        redirectAttributes.addFlashAttribute("message", "Register successfully!");
//        redirectAttributes.addFlashAttribute("c02h", "C02H");
//
//        return "redirect:list";
        List<Product> productList = productService.findAll();
        model.addAttribute("products", productList);
        return "list";
    }

}
