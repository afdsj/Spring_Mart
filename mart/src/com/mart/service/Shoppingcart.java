package com.mart.service;

import java.util.ArrayList;
import java.util.List;

import com.mart.product.Meat;
import com.mart.product.Product;
import com.mart.product.Snacks;
import com.mart.product.Vegetable;

public class Shoppingcart  {
	
	private final List<Product> items;
	private int sum;
	
	public Shoppingcart() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Product item) {
		this.items.add(item);
	}
	
	public int getSum() {
		for (Product product : items) {
			if(product instanceof Meat) {
				Meat meat = (Meat)product;
				sum += meat.getPrice();
			}else if(product instanceof Vegetable) {
				Vegetable vegetable = (Vegetable)product;
				sum += vegetable.getPrice();
			}else if(product instanceof Snacks){
				Snacks snacks = (Snacks)product;
				sum += snacks.getPrice();
			}
		}
		return sum;
	}
	
	public void getItems() {
		for (Product product : items) {
			if(product instanceof Meat) {
				Meat meat = (Meat)product;
				System.out.println(meat.getName()+"\n");
			}else if(product instanceof Vegetable) {
				Vegetable vegetable = (Vegetable)product;
				System.out.println(vegetable.getName()+"\n");
			}else if(product instanceof Snacks){
				Snacks snacks = (Snacks)product;
				System.out.println(snacks.getName()+"\n"); 
			}
		}
	}

	@Override
	public String toString() {
		return "Shoppingcart [items=" + items + "]"; 
	}
}
