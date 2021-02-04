package com.cts;

public class PhoneRepair implements Repair {
	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println("Request for repairing " + modelName + " is accepted!!!");
	}
	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println("Request for repairing " + accessoryType + " is accepted!!!");
	}
}
