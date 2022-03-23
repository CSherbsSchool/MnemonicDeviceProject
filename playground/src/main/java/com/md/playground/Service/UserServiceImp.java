package com.md.playground.Service;

import com.md.playground.dao.UserRepository;
import com.md.playground.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    private SessionFactory sessionFactory;


	public void saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}


	public void deleteUser(int id) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete from User where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }

}
