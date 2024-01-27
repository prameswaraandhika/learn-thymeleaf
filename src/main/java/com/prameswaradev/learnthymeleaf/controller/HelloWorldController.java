package com.prameswaradev.learnthymeleaf.controller;


import com.prameswaradev.learnthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String getHello(Model model){
//        variable expressions
        model.addAttribute("msg", "Hello World!");
        model.addAttribute("user", new User(UUID.randomUUID(), "Andhika", "Jakarta"));
        model.addAttribute("id", UUID.randomUUID());

        return "hello";
    }

    @GetMapping("/welcome")
    public String goToWelcome(){
        return "welcome";
    }

}
