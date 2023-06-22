package com.mart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.mart.product.Beef;
import com.mart.product.Cabbage;
import com.mart.product.HomeRunBall;
import com.mart.product.IndianBop;
import com.mart.product.Lettuce;
import com.mart.product.Meat;
import com.mart.product.Pork;
import com.mart.product.Product;
import com.mart.product.Snacks;
import com.mart.product.Vegetable;
import com.mart.service.Shoppingcart;

@Configuration
public class ContextConfiguration {

	@Bean
	public Product beef() {
		return new Beef("소고기", 100000, 100);
	}
	
	@Bean
	public Product pork() {
		return new Pork("돼지고기", 50000, 100);
	}
	
	@Bean
	public Product lettuce() {
		return new Lettuce("상추", 15000,80);
	}
	
	@Bean
	public Product cabbage() {
		return new Cabbage("배추", 15000, 80);
	}
	
	@Bean
	public Product indianBop() {
		return new IndianBop("인디언밥", 2000, 30);
	}
	
	@Bean
	public Product homeRunBall() {
		return new HomeRunBall("홈런볼", 2500,30);
	}
	
	@Bean
	@Scope("prototype")
	public Shoppingcart cart() {
		return new Shoppingcart();
	}
}
