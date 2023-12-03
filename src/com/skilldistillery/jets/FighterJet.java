package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
		super();
	}
	public FighterJet (String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Jet is firing on target...");
	}
	@Override
	public void evasiveManeuver() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Jet performing evasive actions");
	}
	@Override
	public void loadAmmo() {
		// TODO Auto-generated method stub
		System.out.println("Filling fighter ammo..");
	}
}
