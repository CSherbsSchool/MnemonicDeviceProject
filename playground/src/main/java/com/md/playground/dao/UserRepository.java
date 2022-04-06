package com.md.playground.dao;
 
import com.md.playground.entity.SavedMnemonic;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.md.playground.entity.User;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.userName = :username")
    public User getUserByUsername(@Param("username") String username);

    @Query("SELECT u FROM User u WHERE u.userPassword = :password")
    public User getUserByPassword(@Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.id = ?1")
    List<SavedMnemonic> getUserById(int userID);
	
}
