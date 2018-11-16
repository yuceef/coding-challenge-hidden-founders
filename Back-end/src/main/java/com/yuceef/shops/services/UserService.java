package com.yuceef.shops.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuceef.shops.dao.UserRepository;
import com.yuceef.shops.entities.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User save(User user) {
		user.setRole("USER");
		user.setPositionX(Math.floor(Math.random()*100));
		user.setPositionY(Math.floor(Math.random()*100));
		return userRepository.saveAndFlush(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public User find(Long id) {
		return userRepository.findOne(id);
	}
}
