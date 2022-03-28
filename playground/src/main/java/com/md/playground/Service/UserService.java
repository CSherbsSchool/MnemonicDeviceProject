package com.md.playground.Service;

import com.md.playground.entity.User;

public interface UserService {

	public void saveUser(User user);
	public void deleteUser(int id);
    public User getUser(int id);
}
