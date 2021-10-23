package com.pedestrainsimulation.factorypattern;

public class HighWayRoad {

	public Road tryMove(String modeOfTransport){
	      if(modeOfTransport == null){
	         return null;
	      }		
	      if(modeOfTransport.equalsIgnoreCase("Bycycle")){
	         return new Bycyclist();
	         
	      } else if(modeOfTransport.equalsIgnoreCase("Walker")){
	         return new Walker();
	         
	      } else if(modeOfTransport.equalsIgnoreCase("Night")){
	         return new OddHours();
	      }
	      return null;
	   }
}
