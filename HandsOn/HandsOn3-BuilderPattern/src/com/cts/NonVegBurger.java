package com.cts;
public class NonVegBurger extends Burger {
	@Override
	public String name() {
		return "Non Veg Burger";
	}
	@Override
	public float price() {
		return 35.0f;
	}
}
