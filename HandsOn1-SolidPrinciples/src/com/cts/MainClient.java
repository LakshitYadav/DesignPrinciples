package com.cts;
import java.util.Scanner;

public class MainClient {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String choice;
		String modelNameOrder;
		String modelNameRepair;
		String item;
		String accessoryItem;
		System.out.println("Welcome to our site. Would you like to order or repair?");
		choice = sc.nextLine();
		switch (choice) {
		case "order":
			System.out.println("Please provide the phone model name?");
			modelNameOrder = sc.nextLine();
			PhoneOrder phoneOrder = new PhoneOrder();
			phoneOrder.processOrder(modelNameOrder);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory type that you want to be repaired?");
			item = sc.nextLine();
			if (item.equalsIgnoreCase("phone")) {
				System.out.println("Please provide the phone model name?");
				modelNameRepair = sc.nextLine();
				PhoneRepair phoneRepair = new PhoneRepair();
				phoneRepair.processPhoneRepair(modelNameRepair);
			} else if (item.equalsIgnoreCase("accessory")) {
				System.out.println("Please provide the accessory detail like headphone, tempered glass?");
				accessoryItem = sc.nextLine();
				PhoneRepair phoneRepair = new PhoneRepair();
				phoneRepair.processAccessoryRepair(accessoryItem);
			}
			break;
		default:
			System.out.println("Invalid Choice!!!");
		}
	}
}
