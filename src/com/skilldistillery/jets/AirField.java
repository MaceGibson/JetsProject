package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Scanner;

public class AirField {

	private ArrayList<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();
	}

	public void addJet(Jet jet) {
		jets.add(jet);
	}

	public void listJets() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println("Jet " + (i + 1) + ":");
			System.out.println(jets.get(i).fly());
			System.out.println("--------------------");
		}
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			jet.fly();
			System.out.println("--------------------");
		}
	}

	public void viewFastestJet() {
		Jet fastestJet = null;
		double maxSpeed = Double.MIN_VALUE;

		for (Jet jet : jets) {
			if (jet.getSpeed() > maxSpeed) {
				maxSpeed = jet.getSpeed();
				fastestJet = jet;
			}
		}

		if (fastestJet != null) {
			System.out.println("Fastest Jet:");
			System.out.println(fastestJet.fly());
			System.out.println("--------------------");
		} else {
			System.out.println("No jets in the fleet.");
		}
	}

	public void viewLongestRangeJet() {
		Jet longestRangeJet = null;
		int maxRange = Integer.MIN_VALUE;

		for (Jet jet : jets) {
			if (jet.getRange() > maxRange) {
				maxRange = jet.getRange();
				longestRangeJet = jet;
			}
		}

		if (longestRangeJet != null) {
			System.out.println("Jet with Longest Range:");
			System.out.println(longestRangeJet.fly());
			System.out.println("--------------------");
		} else {
			System.out.println("No jets in the fleet.");
		}
	}

	public void loadAllCargoJets() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
		System.out.println("Cargo loaded on all Cargo Jets.");
	}

	public void dogfight() {
		for (Jet jet : jets) {
			if (jet instanceof CombatReady) {
				((CombatReady) jet).fight();
			}
		}
		System.out.println("Dogfight engaged!");
	}

	public void addJetToAirfield(Scanner input) {
		System.out.println("Enter Jet details:");
		System.out.print("Model: ");
		String model = input.nextLine();
		System.out.print("Speed (in MPH): ");
		double speed = input.nextDouble();
		System.out.print("Range: ");
		int range = input.nextInt();
		System.out.print("Price: ");
		long price = input.nextLong();

		// Assume the user wants to add a PassengerJet
		addJet(new PassengerJet(model, speed, range, price));
		System.out.println("Jet added to the fleet!");
	}

	public void removeJetFromAirfield(Scanner input) {
		System.out.println("Enter the number of the jet to remove:");
		listJets();
		System.out.print("Enter jet number: ");
		int jetNumber = input.nextInt();

		if (removeJet(jetNumber)) {
			System.out.println("Jet removed from the fleet!");
		} else {
			System.out.println("Invalid jet number. No jet removed.");
		}
	}

	public boolean removeJet(int jetNumber) {
		if (jetNumber > 0 && jetNumber <= jets.size()) {
			jets.remove(jetNumber - 1);
			return true;
		}
		return false;
	}
}
