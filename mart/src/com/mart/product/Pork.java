package com.mart.product;

public class Pork extends Meat {

	private int capacity;
	
	public Pork() {
		
	}

	public Pork(String name, int price, int capacity) {
		super(name,price);
		this.capacity = capacity;
	}

	private int getCapacity() {
		return capacity;
	}

	private void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Pork [capacity=" + capacity + "]";
	}
	
}
