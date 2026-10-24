package com.codewithmosh.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    private String index(Model model){
        model.addAttribute("name", "Junior");
        return "index";
    }

//    @RequestMapping("/hello")
//    private String sayHello(){
//        return "index.html";
//    }
}
