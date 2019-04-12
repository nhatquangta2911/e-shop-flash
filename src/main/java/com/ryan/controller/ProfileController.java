package com.ryan.controller;

import com.ryan.javabean.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpSession;

@Controller
public class ProfileController {

    @GetMapping(path = "/profile")
    public String profile() {
        return "profile";
    }
}
