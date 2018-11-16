package com.yuceef.shops.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuceef.shops.dao.ShopRepository;
import com.yuceef.shops.entities.Shop;
import com.yuceef.shops.entities.User;

@Service
public class ShopService {
	@Autowired
	private ShopRepository shopRepository;
	
	public List<Shop> nearBy(User user){	
		return shopRepository.nearBy(user.getPositionX(),user.getPositionY(),user);	
	}

	public Shop find(Long id) {
		return shopRepository.findOne(id);
	}
}
