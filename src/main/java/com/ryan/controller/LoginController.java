package com.ryan.controller;

import com.ryan.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("loginForm") final LoginForm loginForm,
                        final Model model) {
        final String username = loginForm.getUsername();
        final String password = loginForm.getPassword();
        if (username != null && "123456".equals(password)) {
            model.addAttribute("username", username);
            return "/welcome";
        }
        model.addAttribute("errorMessage", "Id or password is invalid");
        return "/login";
    }


}
