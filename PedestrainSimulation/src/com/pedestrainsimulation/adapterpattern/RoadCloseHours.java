package com.pedestrainsimulation.adapterpattern;

public class RoadCloseHours implements Road{

	@Override
	public void pedestrainPath(String modeOfTransport) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void byCycleistPath(String modeOfTransport) {
		
	}

	@Override
	public void closeHours(String day) {
		System.out.println("Road is Closed during "  + day  + "Time");
	} 

}
