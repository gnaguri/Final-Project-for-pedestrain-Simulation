package com.pedestrainsimulation.adapterpattern;

public class RoadSignalAdapter implements RoadSignals{

	Road road;
	
	public RoadSignalAdapter(String signalColor,String day) {
		if(signalColor.equalsIgnoreCase("YellowSignal") && day.equalsIgnoreCase("Morning")){
			road = new Bycyclist();
		}else if(signalColor.equalsIgnoreCase("RedColor")&& day.equalsIgnoreCase("Morning")) {
			road = new Walker();
		}
		else {
			road = new RoadCloseHours();
		}
	}

	@Override
	public void observeSignal(String signalType, String modeOfTransPort, String day) {
		
		if(signalType.equalsIgnoreCase("YellowSignal") && day.equalsIgnoreCase("Morning")){
	         road.byCycleistPath("Bycycle");
	      }
	      else if(signalType.equalsIgnoreCase("RedSignal") && day.equalsIgnoreCase("Morning")){
	         road.pedestrainPath("Walk");
	      }
		
	      else {
	    	  road.closeHours(day);
	      }
	}
	

}
