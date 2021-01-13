package com.example.springbootcrud.example.controller;

import com.example.springbootcrud.example.entity.User;
import com.example.springbootcrud.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/addUser")
    public String showForm (Model model) {
        User user = new User();

        model.addAttribute("user", user);
        return "createScreen";
    }

    @PostMapping("/user/addUser")
    public String submitForm(@ModelAttribute("user") User user) {
        userService.saveUser(user);

        return "redirect:/user";
    }

    @GetMapping("/user")
    public String showUser(Model model) {
        User user = new User();
        List<User> listUser = new ArrayList<User>();
        listUser = userService.getUser();

        if (listUser == null || listUser.size() ==  0) {
            return "emptyScreen";
        }
        else {
            model.addAttribute("user", user);
            model.addAttribute("users", listUser);
            return "listScreen";
        }
    }

    @PostMapping("/user/searchUser")
    public String submitSearchUser(@ModelAttribute("user") User user, Model model) {
        List<User> listUser = new ArrayList<User>();
        listUser =  userService.getUserByName(user.getName());

        if (user.getName() == null || user.getName().equals("") ) {
            model.addAttribute("users", userService.getUser());
        }
        else  {
            model.addAttribute("users",listUser);
        }

        return "listScreen";
    }

}
