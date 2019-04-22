package com.ryan.controller;

import com.ryan.form.LoginForm;
import com.ryan.javabean.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(final Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(final HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doLogin(final Model model,
                          @ModelAttribute("loginForm")
                          final LoginForm loginForm,
                          BindingResult errors, HttpSession session) {
        List<Account> users =
                (List<Account>) session.getAttribute("users");
        if (users == null || users.isEmpty()) {
            model.addAttribute("message", "Username or Password might not correct!");
            return "login";
        }
        for (int i = 0; i < users.size(); ++i) {
            Account account = users.get(i);
            if (account.getEmail().equals(loginForm.getEmail()) &&
                    account.getPassword().equals(loginForm.getPassword())) {
                session.setAttribute("user", account);
                return "redirect:/welcome";
            }
        }
        model.addAttribute("message", "Username or Password might not correct!");
        return "login";
    }
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@Valid @ModelAttribute("loginForm") final LoginForm loginForm,
//                        BindingResult bindingResult,
//                        final Model model) {
//        final String email = loginForm.getEmail();
//        final String password = loginForm.getPassword();
//
//        if(bindingResult.hasErrors()) {
//            System.out.println("Error");
//            return "login";
//        }
//        if (email != null && "123".equals(password)) {
//            model.addAttribute("email", email);
//            System.out.println(email);
//            return "/welcome";
//        } else {
//            model.addAttribute("errMessage", "Oop!!");
//            return "login";
//        }
//    }
}
