package com.cts;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
public class AdapterTest {
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(431.30312,bugattiVeyronAdapter.getSpeed(), 0.00001);
	}
	@Test
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(625477.7955382584,bugattiVeyronAdapter.getPrice(), 0.00001);
	}
}
