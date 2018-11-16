package com.yuceef.shops.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yuceef.shops.entities.Interact;
import com.yuceef.shops.entities.LikeInteract;
import com.yuceef.shops.entities.Shop;
import com.yuceef.shops.entities.User;

public interface InteractRepository extends JpaRepository<Interact, Long> {
	@Query(value = "select i from LikeInteract i WHERE i.user = :u")
	public List<LikeInteract> preferred(@Param("u") User u);

}
