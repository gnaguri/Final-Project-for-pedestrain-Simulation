package com.pedestrainsimulation.statepattern;

public class PassengersNoLuggage implements Airport{

	@Override
	public void pedestrainWalk() {
		System.out.println(" Pedestrain Path is open for passengers");
		
	}

	@Override
	public void close() {
		System.out.println(" esclator is overcrowded, please use pedestrain path to move");
		
	}

	@Override
	public void maintainence() {
		System.out.println(" Way to out gate path is in maintenance.");
		
	}
	

}
