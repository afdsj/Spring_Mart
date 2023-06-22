package com.mart.product;

public class Cabbage extends Vegetable {
	
	private int capacity;
	
	public Cabbage() {
		
	}

	public Cabbage(String name, int price, int capacity) {
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
		return "Cabbage [capacity=" + capacity + "]";
	}

}
