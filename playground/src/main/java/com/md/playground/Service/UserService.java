package com.md.playground.Service;

import com.md.playground.entity.Mnemonic;
import com.md.playground.entity.User;

public interface UserService {

	public abstract void createUser(User user);
	public abstract void deleteUser(Integer id);
	public User loadUserByUsername(String username);
	public User loadUserByPassword(String password);
	public User getUser(int userID);

}
