package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	//constructor
	public CargoPlane() {
		super();
	}
	
	
	public CargoPlane (String model, double speed, int range, long price) {
		super(model, speed, range, price); 
	}

	@Override
	public void loadCargo() {
		// TODO Auto-generated method stub
		System.out.println("Loading cargo.....");
	}

	@Override
	public void unloadCargo() {
		// TODO Auto-generated method stub
		System.out.println("Unloading cargo.....");
	}
	
	
}
