package com.md.playground.dao;

import org.springframework.data.repository.CrudRepository;

import com.md.playground.entity.User;

public interface UserRepository{

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
