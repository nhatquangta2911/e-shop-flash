package com.ryan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping(path = "/welcome")
    public String welcome(final Model model) {
        return "welcome";
    }

}
