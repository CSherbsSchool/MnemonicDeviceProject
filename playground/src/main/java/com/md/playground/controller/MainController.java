package com.md.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {



    @PostMapping ("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping ("/createAccount")
    public String createAccount(Model model) {
        return "createAccount";
    }

}