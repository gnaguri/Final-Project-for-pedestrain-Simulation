package com.pedestrainsimulation.adapterpattern;

public interface Road {

	public void closeHours(String day);
	public void pedestrainPath(String modeOfTransport);
	public void byCycleistPath(String modeOfTransport);
}
