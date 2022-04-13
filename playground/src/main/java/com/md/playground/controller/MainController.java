package com.md.playground.controller;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.md.playground.Service.MnemonicServiceImpl;
import com.md.playground.Service.SavedMnemonicServiceImpl;
import com.md.playground.Service.UserServiceImp;
import com.md.playground.entity.Mnemonic;
import com.md.playground.entity.User;


@Controller
public class MainController {

        
    @Autowired
    UserServiceImp serviceImp;


	@Autowired
	MnemonicServiceImpl mnemonicServiceImpl;

	@Autowired
	SavedMnemonicServiceImpl savedMnemonicServiceImpl;
	
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

	@PostMapping("/profile")
	public String profile(Model model, @RequestParam("userID") int userID)
	{
		User user = serviceImp.getUser(userID);
		
		//Basic signin info setup
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		
		//Get mnemonics that should be on the profile page
		Stream<Mnemonic> userMnemonicStream = mnemonicServiceImpl.getMnemonicsCreatedByUser(userID).stream();
		Stream<Mnemonic> savedMnemonicStream = savedMnemonicServiceImpl.getAllUserSavedMnemonics(userID).stream()
				.map(savedMnemonic -> {
					return mnemonicServiceImpl.getMnemonic(savedMnemonic.getMnemonic_id());
				});
		List<Mnemonic> allMnemonics = Stream.concat(userMnemonicStream, savedMnemonicStream).toList();
		
		//Add the list of mnemonics to the model
		model.addAttribute("mnemonics", allMnemonics);
		
		return "profileHome";
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
	
	@PostMapping("/createFlashcard")
	public String createFlashcard(Model model, @RequestParam("userID") int userID)
	{
		User user = serviceImp.getUser(userID);
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		return "createFlashcard";
	}

	@PostMapping("/addMnemonic")
	public String addMnemonics(Model model, Mnemonic mnemonic) {
		System.out.println(mnemonic.toString());
		mnemonicServiceImpl.createMnemonic(mnemonic);
		return "index";
	}

	@GetMapping(path = "/loginUser")
	public String loginUser(Model model, @RequestParam("userName") String userName)
	{
		System.out.println(userName);
		User user = serviceImp.loadUserByUsername(userName);
		System.out.println(user.getUserName() + " logged in... User ID:" + user.getId());
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		return "index";

	}

}