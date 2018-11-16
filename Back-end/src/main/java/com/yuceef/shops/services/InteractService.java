package com.yuceef.shops.services;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.yuceef.shops.dao.InteractRepository;
import com.yuceef.shops.entities.DislikeInteract;
import com.yuceef.shops.entities.Interact;
import com.yuceef.shops.entities.LikeInteract;
import com.yuceef.shops.entities.Shop;
import com.yuceef.shops.entities.User;

@Service
public class InteractService {
	@Autowired
	private InteractRepository interactRepository;
	
	public LikeInteract like(Shop shop, User user){
		LikeInteract likeInteract = new LikeInteract();
		likeInteract.setUser(user);
		likeInteract.setShop(shop);
		return interactRepository.save(likeInteract);
		
	}
	
	public DislikeInteract dislike(Shop shop, User user){
		DislikeInteract dislikeInteract = new DislikeInteract();
		dislikeInteract.setUser(user);
		dislikeInteract.setShop(shop);
		Date exp = new Date();
		exp.setHours(exp.getHours()+2);
		dislikeInteract.setDateExpire(exp);
		return interactRepository.save(dislikeInteract);
	}
	
	public boolean removeLike(LikeInteract likeInteract) {
		interactRepository.delete(likeInteract);
		return true;
	}
	
	public List<LikeInteract> preferred(User user){
		return interactRepository.preferred(user);
	}
	
	public boolean removeLike(Long interact_id) {
		interactRepository.delete(interact_id);
		return true;
	}
}
