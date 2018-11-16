package com.yuceef.shops.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yuceef.shops.entities.User;
/* this the user  Repository interface  */ 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findOneByUsername(String username);
}
