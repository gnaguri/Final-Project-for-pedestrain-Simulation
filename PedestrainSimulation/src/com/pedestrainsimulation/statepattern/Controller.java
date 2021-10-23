package com.pedestrainsimulation.statepattern;

public class Controller {

	public static PassengersNoLuggage passengerZeroLuggage;
	public static PassengersWithLuggage passengerWithLuggage;

	private static Airport airport;

	/**
	 * Constructor
	 */
	Controller(){
		passengerZeroLuggage = new PassengersNoLuggage();
		passengerWithLuggage = new PassengersWithLuggage();
	}


	public void setpassengerZeroLuggage() {
		airport = passengerZeroLuggage;
	}

	public void setpassengerWithLuggage() {
		airport = passengerWithLuggage;
	}

	public void pedestrainWalk() {
		airport.pedestrainWalk();
	}

	public void close() {
		airport.close();
	}

	public void maintenance() {
		airport.maintainence();
	}

}
