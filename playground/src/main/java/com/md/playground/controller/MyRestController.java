package com.md.playground.controller;


import com.md.playground.Service.*;
import com.md.playground.entity.Mnemonic;
import com.md.playground.entity.SavedMnemonic;
import com.md.playground.entity.Tag;
import com.md.playground.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MyRestController {
    //User
    @Autowired
    UserServiceImp userServiceImp;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userServiceImp.createUser(user);
    }

    //Mnemonics
    @Autowired
    MnemonicServiceImpl mnemonicServiceImpl;

    @PostMapping("/createMnemonic")
    public void createMnemonic(@RequestBody Mnemonic mnemonic){
        mnemonicServiceImpl.createMnemonic(mnemonic);
    }

    //option 1
    @DeleteMapping("/deleteMnemonic/{id}")
    public void deleteMnemonicByPath(@PathVariable int id) {
        mnemonicServiceImpl.deleteMnemonic(id);
    }


    //option 2
    @DeleteMapping("/deleteMnemonic")
    public void deleteMnemonicByParam(@RequestParam(name = "id") int id) {
        mnemonicServiceImpl.deleteMnemonic(id);
    }

    @GetMapping("/getMnemonic")
    public Mnemonic getMnemonic(@RequestParam(name = "id") int id) {
        return mnemonicServiceImpl.getMnemonic(id);
    }

    @GetMapping("/getMnemonicsCreatedByUser")
    public List<Mnemonic> getMnemonicsCreatedByUser(@RequestParam(name = "user_id") int user_id) {
        return mnemonicServiceImpl.getMnemonicsCreatedByUser(user_id);
    }

    @GetMapping("/getAllMnemonics")
    public List<Mnemonic> getAllMnemonics() {
        return mnemonicServiceImpl.getAllMnemonics();
    }

    @GetMapping("/getMnemonicsWithKeyword")
    public List<Mnemonic> getMnemonicsWithKeyword(@RequestParam(name = "keyword") String keyword) {
        return mnemonicServiceImpl.getMnemonicsWithKeyword(keyword);
    }


    //Tag

    @Autowired
    TagServiceImpl tagServiceImpl;

    @PostMapping("/createTag")
    public void createTag(@RequestBody Tag tag) {
        tagServiceImpl.createTag(tag);
    }

    @DeleteMapping("/deleteTag")
    public void deleteTag(@RequestParam(name = "tagID") int tagID) {
        tagServiceImpl.deleteTag(tagID);
    }

    @GetMapping("/getTag")
    public Tag getTag(@RequestParam(name = "tagID") int tagID){
        return tagServiceImpl.getTag(tagID);
    }

    @GetMapping("/getAllMnemonicTags")
    public List<Tag> getAllMnemonicTags(@RequestParam(name = "mnemonicID") int mnemonic_id) {
        return tagServiceImpl.getAllMnemonicTags(mnemonic_id);
    }

    @GetMapping("/getMnemonicIdsOfTagsWithKeyword")
    public List<Object[]> getMnemonicIdsOfTagsWithKeyword(@RequestParam(name = "keyword") String keyword) {
        return tagServiceImpl.getMnemonicIdsOfTagsWithKeyword(keyword);
    }

    //Saved Mnemonics

    @Autowired
    SavedMnemonicServiceImpl savedMnemonicServiceImpl;

    @PostMapping("/createSavedMnemonic")
    public void createSavedMnemonic(@RequestBody SavedMnemonic savedMnemonic) {
        savedMnemonicServiceImpl.createSaveMnemonic(savedMnemonic);
    }

    @DeleteMapping("/deleteSavedMnemonic")
    public void deleteSavedMnemonic(@RequestParam(name = "savedMnemonicID") int savedMnemonicID) {
        savedMnemonicServiceImpl.deleteSavedMnemonic(savedMnemonicID);
    }

    /*@GetMapping("/getSavedMnemonic")
    public SavedMnemonic getSavedMnemonic(@RequestParam(name = "savedMnemonicID") int savedMnemonicID){
        return savedMnemonicServiceImpl.getSavedMnemonic(savedMnemonicID);
    }*/

    @GetMapping("/getAllUserSavedMnemonics")
    List<SavedMnemonic> getAllUserSavedMnemonics(@RequestParam(name = "userID") int userID){
        return savedMnemonicServiceImpl.getAllUserSavedMnemonics(userID);
    }


    //Search

    @Autowired
    SearchServiceImpl searchServiceImpl;

    @GetMapping("/searchForMnemonics")
    public List<Mnemonic> searchForMnemonics(@RequestParam(name = "keyword") String keyword) {
        return searchServiceImpl.searchForMnemonics(keyword);
    }

}
