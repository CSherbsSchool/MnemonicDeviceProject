package com.md.playground.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.md.playground.Service.MnemonicServiceImpl;
import com.md.playground.Service.SavedMnemonicServiceImpl;
import com.md.playground.Service.SearchServiceImpl;
import com.md.playground.Service.TagServiceImpl;
import com.md.playground.Service.UserServiceImp;
import com.md.playground.entity.Mnemonic;
import com.md.playground.entity.SavedMnemonic;
import com.md.playground.entity.Tag;
import com.md.playground.entity.User;


@Controller
public class MainController {

        
    @Autowired
    UserServiceImp serviceImp;


	@Autowired
	MnemonicServiceImpl mnemonicServiceImpl;

	@Autowired
	SavedMnemonicServiceImpl savedMnemonicServiceImpl;

	@Autowired
	SearchServiceImpl searchServiceImpl;
	
	@Autowired
	TagServiceImpl tagServiceImpl;
	
    @RequestMapping("/")
	public String index(Model model)
	{
		return "index";
	}
    
    @RequestMapping("/{userID}-{userName}")
	public String navBarIndex(Model model, @PathVariable("userID") int userID, @PathVariable("userName") String userName)
	{
		User user = serviceImp.getUser(userID);
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
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
		List<Mnemonic> allMnemonics = mnemonicServiceImpl.getMnemonicsCreatedByUser(userID);

		List<SavedMnemonic> savedMnemonicList = savedMnemonicServiceImpl.getAllUserSavedMnemonics(userID);

		for (SavedMnemonic savedMnemonic: savedMnemonicList) {
			allMnemonics.add(mnemonicServiceImpl.getMnemonic(savedMnemonic.getMnemonic_id()));
		}
		
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
		return "index";
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
	public String createFlashcard(ModelMap map, Model model, @RequestParam("userID") int userID)
	{
		User user = serviceImp.getUser(userID);
		Mnemonic mnemonic = new Mnemonic();
		Tag tag = new Tag();
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		map.addAttribute("mnemonic", mnemonic);
		map.addAttribute("tag", tag);
		return "createFlashcard";
	}

	@PostMapping("/searchForMnemonics")
	public String searchForMnemonics(Model model, @RequestParam("query") String query, @RequestParam("userID") int userID)
	{
		List<Mnemonic> results = searchServiceImpl.searchForMnemonics(query);
		System.out.println(results);
		model.addAttribute("mnemonics", results);

		User user = serviceImp.getUser(userID);
		System.out.println(user.toString());
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		return "searchResults";
	}


	@RequestMapping("/viewFlashcard-{userID}-{mnemonic_id}")
	public String viewMnemonic(Model model, @PathVariable int mnemonic_id, @PathVariable("userID") int userID)
	{
		User user = serviceImp.getUser(userID);
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		
		Mnemonic mnemonic = mnemonicServiceImpl.getMnemonic(mnemonic_id);
		String[] showMnemonic = mnemonicServiceImpl.splitMnemonic(mnemonic);
		String[] showConcept = mnemonicServiceImpl.splitConcept(mnemonic);
		model.addAttribute("mnemonic", mnemonic);
		model.addAttribute("device", showMnemonic);
		model.addAttribute("concept", showConcept);
		
		return "studyView";
	}
	
	@PostMapping("/addMnemonic")
	public String addMnemonics(Model model, Mnemonic mnemonic, @RequestParam("tag") String tag, @RequestParam("creator_userID") int userID) {
		System.out.println(mnemonic.toString());
		User user = serviceImp.getUser(userID);
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		
		mnemonicServiceImpl.createMnemonic(mnemonic);
		int mnemonic_id = mnemonic.getMnemonic_id();
		List<Tag> tagSet = tagServiceImpl.splitTag(tag, mnemonic_id);
		for (Tag eachTag: tagSet) {
			tagServiceImpl.createTag(eachTag);
		}
		return "index";
	}

	@RequestMapping("/loginUser")
	public String loginUser(Model model, @RequestParam("userName") String userName)
	{
		System.out.println(userName);
		User user = serviceImp.loadUserByUsername(userName);
		System.out.println(user.getUserName() + " logged in... User ID:" + user.getId());
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		return "index";

	}
	
	@PostMapping("/deleteMnemonic")
	public String deleteMnemonic (Model model, @RequestParam("mnemonic_id") int mnemonic_id, @RequestParam("userID") int userID) {
		User user = serviceImp.getUser(userID);
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());

		Mnemonic mnemonic = mnemonicServiceImpl.getMnemonic(mnemonic_id);
		if (userID == mnemonic.getCreator_userID()) {
			mnemonicServiceImpl.deleteMnemonic(mnemonic_id);
		}
		else {
			SavedMnemonic savedMnemonic = savedMnemonicServiceImpl.getSavedMnemonic(userID, mnemonic_id);
			savedMnemonicServiceImpl.deleteSavedMnemonic(savedMnemonic.getSaved_mnemonicsID());
		}
		return "index";
	}
	
	@PostMapping("/saveMnemonic")
	public String saveMnemonic (Model model, @RequestParam("mnemonic_id") int mnemonic_id, @RequestParam("userID") int userID) {
		User user = serviceImp.getUser(userID);
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("userID", user.getId());
		Mnemonic mnemonic = mnemonicServiceImpl.getMnemonic(mnemonic_id);
		SavedMnemonic savedMnemonic = new SavedMnemonic(userID, mnemonic_id);
		
		List<SavedMnemonic> savedList = savedMnemonicServiceImpl.getAllUserSavedMnemonics(userID);
		boolean checkList = true;
		for (SavedMnemonic eachMnemonic: savedList) {
			if (savedMnemonic.getMnemonic_id() == eachMnemonic.getMnemonic_id()) {
				checkList = true;
				System.out.println("checked");
				break;
			}
			else {
				checkList = false;
			}
		}
		System.out.println(checkList);
		if ((userID != mnemonic.getCreator_userID()) && (checkList == false)) {
			savedMnemonicServiceImpl.createSaveMnemonic(savedMnemonic);
		}
		return "index";
	}

}