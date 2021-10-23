package com.pedestrainsimulation.factorypattern;

public class TrafficFactoryMain {

	public static void main(String[] args) {
	HighWayRoad highWayRoad = new HighWayRoad();
	
    Road byCyclist = highWayRoad.tryMove("Bycycle");

    
    byCyclist.allowedTime();

    
    Road pedestrain = highWayRoad.tryMove("Walker");
 
    pedestrain.allowedTime();


    Road oddHours = highWayRoad.tryMove("Night");

    oddHours.allowedTime();
    
    }
}
