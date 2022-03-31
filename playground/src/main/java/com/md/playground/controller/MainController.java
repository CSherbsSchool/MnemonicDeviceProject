package com.md.playground.controller;

import com.md.playground.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.md.playground.Service.UserServiceImp;
import com.md.playground.entity.User;


@Controller
public class MainController {


    @Autowired
    UserServiceImp serviceImp;

	@Autowired
	UserRepository repo;
	    
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
	
	@PostMapping(path = "/addUser")
	public String addUser(User user)
	{
		System.out.println(user);
		serviceImp.createUser(user);
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

	@GetMapping(path = "/loginUser")
	public String loginUser(@RequestParam("userName") String userName)
	{
		System.out.println(userName);
		User user = serviceImp.loadUserByUsername(userName);
		return "index";

	}

}