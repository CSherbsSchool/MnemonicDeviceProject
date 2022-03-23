package com.md.playground.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.md.playground.Service.UserServiceImp;
import com.md.playground.entity.User;


@Controller
public class MainController {

	@Autowired
	UserServiceImp serviceImp;

	@RequestMapping("/")
	public String index(Model model)
	{
		return "index";
	}

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

}