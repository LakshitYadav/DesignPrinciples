package com.cts;

public interface Observer {
	public void update(Message message); 
	public void changeState(Message state);
}
