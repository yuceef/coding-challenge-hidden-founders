package com.yuceef.shops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yuceef.shops.dao.ShopRepository;
import com.yuceef.shops.entities.Shop;
import com.yuceef.shops.entities.User;
import com.yuceef.shops.services.ShopService;

@RestController
@RequestMapping("api")
public class ShopController {
	@Autowired
	private ShopService shopService;

	@CrossOrigin
	@PostMapping(path = "/nearby")
	public List<Shop> nearBy(@RequestBody User user){
		return shopService.nearBy(user);
	}	
}
