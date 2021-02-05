package com.cts;
public class ProjectManager implements LeaveRequestHandler {
	LeaveRequestHandler nextHandler = new HR();
	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		if (leaveRequest.getLeaveDays() > 3 && leaveRequest.getLeaveDays() <= 5) {
			System.out.println("Project Manager approved " + leaveRequest.getLeaveDays() + " days leave for Employee: "
					+ leaveRequest.getEmployeeName());
		} else {
			this.nextHandler.handleRequest(leaveRequest);
		}
	}
}
