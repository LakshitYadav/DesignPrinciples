package com.cts;

public class PhoneOrder implements Order {
	@Override
	public void processOrder(String modelName) {
		System.out.println("Order for " + modelName + " has been accepted!!!");

	}

}
