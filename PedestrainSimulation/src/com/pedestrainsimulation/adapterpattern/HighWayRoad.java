package com.pedestrainsimulation.adapterpattern;

public class HighWayRoad implements RoadSignals {

	RoadSignalAdapter roadSignalAdapter;
	@Override
	public void observeSignal(String signalColor, String modeOfTransport, String day) {
		
	      if(signalColor.equalsIgnoreCase("RedSignal")){
	         System.out.println("Walkers Turn: " + modeOfTransport);			
	      } 
	      
	      else if(signalColor.equalsIgnoreCase("YellowSignal") || signalColor.equalsIgnoreCase("RedLight")){
	    	  roadSignalAdapter = new RoadSignalAdapter(signalColor,day);
	    	  roadSignalAdapter.observeSignal(signalColor, modeOfTransport,day);
	      }
	      
	      else{
	         System.out.println(modeOfTransport +  " Please do not SideWalk/Move. Please wait until Red/Yellow signal");
	      }
		
	}

}
