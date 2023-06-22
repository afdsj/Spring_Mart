package com.mart.product;

public class Snacks implements Product{
	
	private String name;
	private int price;
	
	public Snacks() {
		
	}

	public Snacks(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Snacks [name=" + name + ", price=" + price + "]";
	}

}
