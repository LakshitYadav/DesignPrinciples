package com.cts;
public class AudiFactory implements Factory {
	@Override
	public Headlight makeHeadLight() {
		return new AudiHeadlight();
	}
	@Override
	public Tire makeTire() {
		return new AudiTire();
	}
}
