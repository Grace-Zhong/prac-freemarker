package pers.grace.pracfreemarker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @GetMapping
    public String getHome(ModelMap map) {
        map.addAttribute("name", "My Name");
        return "index";
    }
}
