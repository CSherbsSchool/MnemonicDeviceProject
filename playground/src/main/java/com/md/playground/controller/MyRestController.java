package com.md.playground.controller;


import com.md.playground.Service.MnemonicServiceImpl;
import com.md.playground.Service.UserServiceImp;
import com.md.playground.entity.Mnemonic;
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

}
