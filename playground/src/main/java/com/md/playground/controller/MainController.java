package com.md.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	  @GetMapping("/login")
	  public String login(Model model) {
	  	return "login";
  	}


	  @RequestMapping("/home-dev")
	  public String testHome(Model model) {
	  	return "home-dev";
	  }


    @RequestMapping ("/login")
    public String login(Model model) {
        return "login";
    }


    @RequestMapping ("/createAccount")
    public String createAccount(Model model) {
        return "createAccount";
    }

}