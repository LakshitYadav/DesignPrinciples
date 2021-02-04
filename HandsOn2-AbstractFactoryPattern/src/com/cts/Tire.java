package com.cts;
public abstract class Tire {
	public abstract String getModel();
	@Override
	public String toString() {
		return "Tire [getModel()=" + getModel() + "]";
	}
}
