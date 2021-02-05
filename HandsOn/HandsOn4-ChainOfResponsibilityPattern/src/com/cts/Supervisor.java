package com.cts;
public class Supervisor implements LeaveRequestHandler {
	LeaveRequestHandler nextHandler = new ProjectManager();
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		if (leaveRequest.getLeaveDays() >= 1 && leaveRequest.getLeaveDays() <= 3) {
			System.out.println("Supervisor approved " + leaveRequest.getLeaveDays() + " days leave for Employee: "
					+ leaveRequest.getEmployeeName());
		} else {
			this.nextHandler.handleRequest(leaveRequest);
		}
	}
}
