package com.pedestrainsimulation.facadepattern;

public class PedestrainFacadeMain {

	public static void main(String[] args) {
		
		HighWayRoad highWayRoad = new HighWayRoad();
		
		highWayRoad.tryByclesMove();
		highWayRoad.tryPedestrainsMove();
		highWayRoad.tryMoveOddHours();

	}

}
