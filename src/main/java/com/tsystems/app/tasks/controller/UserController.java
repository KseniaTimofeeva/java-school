package com.tsystems.app.tasks.controller;

import com.tsystems.app.tasks.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by ksenia on 28.09.2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public String getUsers(@RequestParam(value = "searchedParam", required = false) String searchedParam, Model model) {
        model.addAttribute("users", userService.findUsers(searchedParam));
        return "users";
    }


}
