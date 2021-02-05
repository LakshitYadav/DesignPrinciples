package com.cts;
public class MainProgram {
	public static void main(String args[]) {
		LeaveRequest request1 = new LeaveRequest("Sam", 7);
		Supervisor sup1 = new Supervisor();
		sup1.handleRequest(request1);

		LeaveRequest request2 = new LeaveRequest("John", 4);
		Supervisor sup2 = new Supervisor();
		sup2.handleRequest(request2);

		LeaveRequest request3 = new LeaveRequest("Max", 2);
		Supervisor sup3 = new Supervisor();
		sup3.handleRequest(request3);
	}
}
