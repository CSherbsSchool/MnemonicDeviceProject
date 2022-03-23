package com.md.playground.dao;

import com.md.playground.Service.UserService;
import com.md.playground.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class UserRepositoryImp implements UserRepository{

    @Autowired
    public UserService userService;

    @Transactional
    public void saveUser(User user) {
        userService.saveUser(user);
    }

    @Override
    public User getUser(int id) {
        return userService.getUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userService.deleteUser(id);
    }
}