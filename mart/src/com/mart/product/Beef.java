package com.mart.product;

public class Beef extends Meat {

	private int capacity;
	
	public Beef() {
		
	}

	public Beef(String name, int price, int capacity) {
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
		return "Beef [capacity=" + capacity + "]";
	}
	
}
