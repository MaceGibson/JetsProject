package com.skilldistillery.jets;

public abstract class Jet {

	//private fields that all jets must have
	private String model;
	private double speed;
	private int range;
	private long price;
	
	//no args constructor
	public Jet() {
	}
	
	//all-args constructor
	public Jet(String model, double speed, int range, long price) {
		this();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	//getters & setters
	public String getModel() {
		return model;
	}

	public double getSpeed() {
		return speed;
	}

	public int getRange() {
		return range;
	}

	public long getPrice() {
		return price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	
	public void loadCrew() {
		System.out.println("Crew is boarding the jet....");
	}
	
	public void unloadCrew() {
		System.out.println("Crew is disembarking from the jet...");
	}

	public String fly() {
		
		return "Jet: "+"\n Model = "+ model +"\n Speed = " + speed + "\n Range = " + range + "\n Price = " + price + "\n Miles till empty = "+ (range / speed);
	}
	
	
}
