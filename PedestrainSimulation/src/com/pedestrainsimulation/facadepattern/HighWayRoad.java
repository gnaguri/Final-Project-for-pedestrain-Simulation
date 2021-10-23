package com.pedestrainsimulation.facadepattern;

public class HighWayRoad {

	private Road byCyclist;
	private Road walker;
	private Road oddHours;
	
	public HighWayRoad() {
		byCyclist = new Bycyclist();
		walker = new Walker();
		oddHours = new OddHours();
		
	}
	
	public void tryByclesMove() {
		byCyclist.allowedTime();;
	}
	public void tryPedestrainsMove() {
		walker.allowedTime();;
	}
	public void tryMoveOddHours() {
		oddHours.allowedTime();;
	}
}
