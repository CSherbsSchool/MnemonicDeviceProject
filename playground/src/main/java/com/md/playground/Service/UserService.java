package com.md.playground.Service;

import com.md.playground.entity.User;

public interface UserService {

	public abstract void createUser(User user);
	public abstract void deleteUser(Integer id);
    public User getUser(int id);
}
