package com.mart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mart.config.ContextConfiguration;
import com.mart.product.Beef;
import com.mart.product.Cabbage;
import com.mart.product.HomeRunBall;
import com.mart.product.IndianBop;
import com.mart.product.Lettuce;
import com.mart.product.Meat;
import com.mart.product.Pork;
import com.mart.product.Product;
import com.mart.service.Shoppingcart;

public class Applicaiton {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
		
		Product beef = context.getBean("beef", Beef.class);
		Product pork = context.getBean("pork", Pork.class);
		Product Lettuce = context.getBean("lettuce", Lettuce.class);
		Product Cabbage = context.getBean("cabbage", Cabbage.class);
		Product IndianBop = context.getBean("indianBop", IndianBop.class);
		Product HomeRunBall = context.getBean("homeRunBall", HomeRunBall.class);
		
		Shoppingcart soim = context.getBean("cart", Shoppingcart.class);
		
		soim.addItem(beef);
		soim.addItem(pork);
		soim.addItem(Lettuce);
		soim.addItem(Cabbage);
		soim.addItem(IndianBop);
		soim.addItem(HomeRunBall);

		System.out.println("soim cart : ");
		soim.getItems();
		System.out.println(soim.getSum());
	}
}
