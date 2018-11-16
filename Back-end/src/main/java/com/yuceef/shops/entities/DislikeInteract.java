package com.yuceef.shops.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@DiscriminatorValue("DISLIKE")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DislikeInteract extends Interact {
	private Date dateExpire;

	public DislikeInteract() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DislikeInteract(Long id, User user, Shop shop) {
		super(id, user, shop);
		// TODO Auto-generated constructor stub
	}

	public DislikeInteract(Date dateExpire) {
		super();
		this.dateExpire = dateExpire;
	}
	
	public DislikeInteract(Long id, User user, Shop shop, Date dateExpire) {
		super(id, user, shop);
		this.dateExpire = dateExpire;
	}

	public Date getDateExpire() {
		return dateExpire;
	}

	public void setDateExpire(Date dateExpire) {
		this.dateExpire = dateExpire;
	}

}
