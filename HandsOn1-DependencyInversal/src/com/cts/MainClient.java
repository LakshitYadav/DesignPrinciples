package com.cts;
public class MainClient {
	public static void main(String args[]) {
		IPhone redmiPhone = new Redmi7();
		ProcessPhoneRepair processRepair1 = new ProcessPhoneRepair();
		processRepair1.repairSteps(redmiPhone);

		IPhone samsungPhone = new SamsungNote();
		ProcessPhoneRepair processRepair2 = new ProcessPhoneRepair();
		processRepair2.repairSteps(samsungPhone);

	}
}
