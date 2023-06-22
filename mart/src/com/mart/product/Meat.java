package com.mart.product;

public class Meat implements Product{

	private String name;
	private int price;
	
	public Meat() {
	}

	public Meat(String name, int price) {
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
		return "Meat [name=" + name + ", price=" + price + "]";
	}
}
