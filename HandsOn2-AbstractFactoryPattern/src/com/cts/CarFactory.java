package com.cts;
public class CarFactory {
	public static Factory getFactoryModel(Factory factory) {
		factory.makeHeadLight();
		factory.makeTire();
		return factory;
	}
}
