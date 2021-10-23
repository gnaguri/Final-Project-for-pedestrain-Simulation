package com.pedestrainsimulation.adapterpattern;

public class MainRoadAdapter {

	public static void main(String[] args) {
		HighWayRoad highwayRoad = new HighWayRoad();

		highwayRoad.observeSignal("GreenSignal", "LMV/HMV Moving", "Night");
		highwayRoad.observeSignal("RedSignal", "Walkers Must Take Zebra Cross", "Morning");
		highwayRoad.observeSignal("YellowSignal", "Bycycle", "Night");
		highwayRoad.observeSignal("RedSignal", "SideWalk Allowed", "Morning");

	}

}
