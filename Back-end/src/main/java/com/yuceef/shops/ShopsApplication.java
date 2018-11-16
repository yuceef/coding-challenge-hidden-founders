package com.yuceef.shops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yuceef.shops.dao.ShopRepository;
import com.yuceef.shops.entities.Shop;

@SpringBootApplication
public class ShopsApplication implements ApplicationRunner {
	@Autowired
	private ShopRepository shopRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ShopsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		for(int i=1;i<26;i++) {
			shopRepository.save(new Shop("test name shop "+i,"https://dummyimage.com/600x400/ffffff/3071c7.png&text=Image : test name shop "+i,Math.floor(Math.random()*100),Math.floor(Math.random()*100)));
		}
	}
}
