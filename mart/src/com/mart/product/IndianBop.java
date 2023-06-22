package com.mart.product;

public class IndianBop extends Snacks {

	private int capacity;
	
	public IndianBop() {
		
	}

	public IndianBop(String name, int price,int capacity) {
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
		return "IndianBop [capacity=" + capacity + "]";
	}


}
