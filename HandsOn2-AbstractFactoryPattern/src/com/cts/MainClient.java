package com.cts;
public class MainClient {
	public static void main(String[] args) {
		Factory audiCar = CarFactory.getFactoryModel(new AudiFactory());
		Factory mercedesCar = CarFactory.getFactoryModel(new MercedesFactory());

		Headlight audiHeadLight = audiCar.makeHeadLight();
		Headlight headlightMercedes = mercedesCar.makeHeadLight();
		Tire audiTire = audiCar.makeTire();
		Tire mercededTire = mercedesCar.makeTire();

		System.out.println("****AUDI FACTORY****");
		System.out.println(audiHeadLight);
		System.out.println(audiTire);
		System.out.println("****MERCEDES FACTORY****");
		System.out.println(headlightMercedes);
		System.out.println(mercededTire);
	}
}
