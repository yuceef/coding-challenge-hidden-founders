package com.yuceef.shops.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuceef.shops.entities.DislikeInteract;
import com.yuceef.shops.entities.Interact;
import com.yuceef.shops.entities.LikeInteract;
import com.yuceef.shops.entities.Shop;
import com.yuceef.shops.entities.User;
import com.yuceef.shops.services.InteractService;
import com.yuceef.shops.services.ShopService;

@RestController
@RequestMapping("api")
public class InteractController {
	@Autowired
	private InteractService interactService;
	@Autowired
	private ShopService shopService;
	
	@CrossOrigin
	@PostMapping(path = "/like/{shop_id}")
	public LikeInteract like(@PathVariable Long shop_id,@RequestBody User user){
		Shop shop = shopService.find(shop_id);
		return interactService.like(shop,user);
	}
	
	@CrossOrigin
	@PostMapping(path = "/preferred")
	public List<LikeInteract> preferred(@RequestBody User user){
		return interactService.preferred(user);
	}
	
	@CrossOrigin
	@PostMapping(path = "/removelike/{interact_id}")
	public boolean removeLike(@PathVariable Long interact_id){
		return interactService.removeLike(interact_id);
	}
	
	@CrossOrigin
	@PostMapping(path = "/dislike/{shop_id}")
	public DislikeInteract dislike(@PathVariable Long shop_id,@RequestBody User user){
		Shop shop = shopService.find(shop_id);
		return interactService.dislike(shop,user);
	}	
}
