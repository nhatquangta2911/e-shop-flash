package com.ryan.controller;

import com.ryan.entity.User;
import com.ryan.form.LoginForm;
import com.ryan.javabean.Account;
import com.ryan.service.LoginService;
import com.ryan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;


@Controller
public class LoginController {

    @Resource
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    public String doLogout(final Model model,
                           HttpSession session) {
        session.removeAttribute("user");
        return "welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(@Valid LoginForm loginForm,
                          BindingResult result,
                          final Model model) {
        if(result.hasErrors()) {
            return "login_user";
        }

        User user = userService.getUserByEmail(loginForm.getEmail());
        System.out.println(user.getEmail());

        if(user != null && user.getPassword().equals(loginForm.getPassword()) ) {
            model.addAttribute("user", user.getFullName());
            return "welcome";
        } else {
            model.addAttribute("error", "Email or Password might not correct");
            return "login_user";
        }
    }



}
