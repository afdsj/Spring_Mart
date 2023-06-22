package com.mart.product;

public class HomeRunBall extends Snacks {
	
	private int capacity;
	
	public HomeRunBall() {
		
	}

	public HomeRunBall(String name, int price,int capacity) {
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
		return "HomeRunBall [capacity=" + capacity + "]";
	}

	
}
