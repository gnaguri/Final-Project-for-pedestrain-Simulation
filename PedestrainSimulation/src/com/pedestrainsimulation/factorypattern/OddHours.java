package com.pedestrainsimulation.factorypattern;

public class OddHours implements Road{

	@Override
	public void allowedTime() {
		System.out.println(" Road is blocked due to odd hours. Please take diversion");
		
	}

	

}
