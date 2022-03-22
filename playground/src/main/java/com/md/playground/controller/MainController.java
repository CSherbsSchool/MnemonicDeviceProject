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
	
	@PostMapping(path = "/addUser")
	public String addUser(User user)
	{
		System.out.println(user);
		serviceImp.createUser(user);
		return "login";
	}
	
	@RequestMapping("/home-dev")
	public String testHome(Model model) 
	{
		return "home-dev";
	}
	
	@RequestMapping("/createAccount")
	public String createAccount(Model model) 
	{
		return "createAccount";
	}

}