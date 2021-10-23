package com.pedestrainsimulation.statepattern;

public class PassengersWithLuggage implements Airport{

	@Override
	public void pedestrainWalk() {
		System.out.println(" Pedestrain walk is not open for Passengers with Luggage");
		
	}

	@Override
	public void close() {
		System.out.println(" Gate 2 pedestrain path is overcrowded and closed");
		
	}

	@Override
	public void maintainence() {
		System.out.println(" Gate 1 pedestrain path is in maintainence");
		
	}

}
