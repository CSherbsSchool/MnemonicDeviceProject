package com.md.playground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.md.playground.entity.User;

@Controller
public class MainController {

	@RequestMapping("/home-dev/login")
	public String testHomeLogin(Model model) {
		//TODO Add sign-in check elsewhere
		// Also, change the class configuration
		User.user user = new User().new user();
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
	

	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@RequestMapping("/createAccount")
	public String createAccount(Model model) {
		return "createAccount";
	}

}