package com.md.playground.Service;

import com.md.playground.dao.UserRepository;
import com.md.playground.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Override
	public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

}
