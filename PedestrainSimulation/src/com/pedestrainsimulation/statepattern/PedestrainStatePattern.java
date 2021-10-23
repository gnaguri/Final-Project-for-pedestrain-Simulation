package com.pedestrainsimulation.statepattern;

public class PedestrainStatePattern {

	Controller controller;

	/**
	 * @param controller
	 */
	public PedestrainStatePattern(String con) {
		controller = new Controller();

		if(con.equalsIgnoreCase("passengerZeroLuggage")) 
			controller.setpassengerZeroLuggage();

		if(con.equalsIgnoreCase("passengerWithLuggage")) 
			controller.setpassengerWithLuggage();

		controller.pedestrainWalk();
		controller.maintenance();
		controller.close();

	}
	
	public static void main(String args[]) {
		new PedestrainStatePattern("passengerZeroLuggage");
		new PedestrainStatePattern("passengerWithLuggage");
	}
}
