package com.prameswaradev.learnthymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping
    public String getHello(Model model){
        model.addAttribute("msg", "Hello World!");
        return "hello";
    }
}
