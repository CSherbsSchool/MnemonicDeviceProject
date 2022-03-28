package com.md.playground.dao;
 
import org.springframework.data.repository.CrudRepository;

import com.md.playground.entity.User; 

public interface UserRepository extends CrudRepository<User, Integer> {

	
}
