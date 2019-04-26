package com.ryan.controller;

import com.ryan.entity.User;
import com.ryan.form.UserForm;
import com.ryan.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/doLogin", method = RequestMethod.GET)
    public String doLogin() {
        return "login_user";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(final Model model) {
        return "";
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public String getAllUsers(final Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "show_all_users";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser() {
        return "get_user";
    }

    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public String getUser(final Model model, @RequestParam("userId") final int userId) {
        final User user = userService.getUserById(userId);
        if(user != null) {
            model.addAttribute("user", user);
            return "show_user";
        } else {
            return "show_user";
        }
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(final Model model) {
        model.addAttribute("userForm", new UserForm());
        return "add_user";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("userForm") final UserForm userForm) {
        final User user = new User();
        user.setId(userForm.getId());
        user.setPassword(userForm.getPassword());
        user.setFullName(userForm.getFullName());
        user.setPhoto(userForm.getPhoto());
        user.setEmail(userForm.getEmail());

        userService.addUser(user);

        return "redirect:/getAllUsers";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public String deleteUser() {
        return "delete_user";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
    public String deleteUser(@RequestParam("userId") final int userId) {
        userService.deleteUser(userId);
        return "redirect:/getAllUsers";
    }

}
