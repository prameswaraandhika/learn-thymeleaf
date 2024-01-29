package com.prameswaradev.learnthymeleaf.controller;

import com.prameswaradev.learnthymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    @GetMapping(value = "/register")
    public String registPage(Model model){
        User user = new User();
        model.addAttribute("user", user);

        List<String> cities = Arrays.asList(
                "Jakarta", "Bekasi", "Bandung"
        );

        model.addAttribute("cities", cities);
        return "registration_form";
    }

    @PostMapping(value = "/register/save")
    public String submitForm(Model model,
                             @ModelAttribute("user") User user){
        model.addAttribute("user", user);
        return "register_success";
    }
}
