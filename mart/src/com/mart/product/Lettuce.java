package com.mart.product;

public class Lettuce extends Vegetable {

	private int capacity;
	
	public Lettuce() {
		
	}

	public Lettuce(String name, int price, int capacity) {
		super(name, price);
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
		return "Lettuce [capacity=" + capacity + "]";
	}
	
	
}
