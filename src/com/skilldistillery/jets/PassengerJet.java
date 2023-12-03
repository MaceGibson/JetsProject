package com.skilldistillery.jets;

public class PassengerJet extends Jet {

	public PassengerJet() {
		super();
	}

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void loadPassengers() {
		System.out.println("Now boarding all passengers...");
	}

	public void unloadPassengers() {
		System.out.println("All passengers are disembarking from the jet.");
	}
}
