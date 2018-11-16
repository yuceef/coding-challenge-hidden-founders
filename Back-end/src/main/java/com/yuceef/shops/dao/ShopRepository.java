package com.yuceef.shops.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.yuceef.shops.entities.Shop;
import com.yuceef.shops.entities.User;

public interface ShopRepository extends JpaRepository<Shop, Long> {
	@Query(value = "select s from Shop s WHERE (SELECT count(id) from LikeInteract l WHERE l.user = :u and l.shop = s)=0 and (SELECT count(id) from DislikeInteract d WHERE d.user = :u and d.shop = s and d.dateExpire > NOW())=0  ORDER BY ((positionX - :x)*(positionX - :x) + (positionY - :y)*(positionY - :y))")
	public List<Shop> nearBy(@Param("x") double x,@Param("y") double y,@Param("u") User u);
	}
