package pl.sda.sapiens.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index(@RequestParam String name, @RequestParam(name = "age", defaultValue = "25") int age,  Model model){
        model.addAttribute("age", age);
        model.addAttribute("name", name);
        return "index";
    }
}
