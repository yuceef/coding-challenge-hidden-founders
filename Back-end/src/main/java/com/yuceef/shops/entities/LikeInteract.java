package com.yuceef.shops.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@DiscriminatorValue("LIKE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class LikeInteract extends Interact {

	public LikeInteract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LikeInteract(Long id, User user, Shop shop) {
		super(id, user, shop);
		// TODO Auto-generated constructor stub
	}
	
}
