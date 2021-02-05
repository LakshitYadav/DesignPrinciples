package com.cts;
import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
	private List<Observer> observers = new ArrayList<>();
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	@Override
	public void notifyUpdate(Message message) {
		for (Observer o : observers) {
			o.update(message);
		}
	}
	@Override
	public void notifyChangeState(Message state) {
		for (Observer o : observers) {
			o.changeState(state);
		}
	}
}
