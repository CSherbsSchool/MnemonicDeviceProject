package com.md.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

<<<<<<< Updated upstream


    @PostMapping ("/login")
    public String login(Model model) {
        return "login";
    }

    @PostMapping ("/createAccount")
    public String createAccount(Model model) {
        return "createAccount";
    }
=======
	@RequestMapping("/login")
	public String login(Model model) 
	{
	    return "login";
	}

	
	@RequestMapping("/home-dev/login")
	public String testHomeLogin(Model model) {
		//TODO Add sign-in check elsewhere
		User user = new User();
		user.setUserName("John Doe");
		model.addAttribute("user", user); // signed in
		return "home-dev";
	}
	
	@RequestMapping("/home-dev/logout")
	public String testHomeLogout(Model model) {
		//TODO Add sign-in check elsewhere
		model.addAttribute("user", null); // signed out
		return "home-dev";
	}
	
	@RequestMapping("/home-dev")
	public String testHome(Model model) {
		return "redirect:/home-dev/login";
	}
	
	@RequestMapping("/createAccount")
	public String createAccount(Model model) 
	{
		return "createAccount";
	}
>>>>>>> Stashed changes

}