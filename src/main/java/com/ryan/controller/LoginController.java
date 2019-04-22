package com.ryan.controller;

import com.ryan.form.LoginForm;
import com.ryan.javabean.Account;
import com.ryan.service.LoginService;
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
    private LoginService loginService;


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
                          final Model model,
                          HttpSession session) {
        if(result.hasErrors()) {
            return "login_user";
        }
        boolean userExists = loginService.checkLogin(loginForm.getEmail(), loginForm.getPassword());
        if(userExists) {
            model.addAttribute("loginForm", loginForm);
            session.setAttribute("user", loginForm);
            return "redirect:/welcome";
        } else {
            model.addAttribute("error", "Email or Password might not correct");
            return "login_user";
        }
    }



}
