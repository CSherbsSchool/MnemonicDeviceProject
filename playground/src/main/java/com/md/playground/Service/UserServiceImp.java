package com.md.playground.Service;

import com.md.playground.dao.UserRepository;
import com.md.playground.entity.User;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private UserRepository repo;

    @Override
	public void createUser(User user) {
    	repo.save(user);		
	}


	@Override
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}


	public User loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.getUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return user;
	}

	public User loadUserByPassword(String password) throws UsernameNotFoundException {
		User user = repo.getUserByPassword(password);
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}
		return user;
	}



}
