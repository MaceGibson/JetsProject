package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	public static void main(String[] args) {
		// Create an Airfield
		AirField airfield = new AirField();

		// Populate the Airfield with 5 jets
		airfield.addJet(createFighterJet("F-22", 1500.0, 1200, 150000000));
		airfield.addJet(createCargoPlane("Boeing C-17 Globemaster III", 450.0, 6000, 220000000));
		airfield.addJet(createPassengerJet("Airbus A380", 560.0, 8500, 500000000));
		airfield.addJet(createFighterJet("F-35 Lightning II", 1200.0, 1000, 95000000));
		airfield.addJet(createCargoPlane("Lockheed Martin C-130 Hercules", 350.0, 2500, 100000000));

		// Display information about all jets in the Airfield
		airfield.listJets();

		// Run the menu
		runMenu(airfield);
	}

	private static void runMenu(AirField airfield) {
		Scanner input = new Scanner(System.in);

		int choice;
		do {
			displayMenu();
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
			input.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				airfield.listJets();
				break;
			case 2:
				airfield.flyAllJets();
				break;
			case 3:
				airfield.viewFastestJet();
				break;
			case 4:
				airfield.viewLongestRangeJet();
				break;
			case 5:
				airfield.loadAllCargoJets();
				break;
			case 6:
				airfield.dogfight();
				break;
			case 7:
				airfield.addJetToAirfield(input);
				break;
			case 8:
				airfield.removeJetFromAirfield(input);
				break;
			case 9:
				System.out.println("Exiting program. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (choice != 9);//make program run till user chooses quit (9).

		input.close();
	}

	private static void displayMenu() {
		System.out.println("MENU:");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
	}

	private static FighterJet createFighterJet(String model, double speed, int range, long price) {
		FighterJet fighterJet = new FighterJet(model, speed, range, price);
		fighterJet.loadAmmo();//Load ammo
		fighterJet.loadCrew();// Load crew onto the fighter jet
		return fighterJet;
	}

	private static CargoPlane createCargoPlane(String model, double speed, int range, long price) {
		CargoPlane cargoPlane = new CargoPlane(model, speed, range, price);
		cargoPlane.loadCargo(); // Load cargo onto the cargo plane
		return cargoPlane;
	}

	private static PassengerJet createPassengerJet(String model, double speed, int range, long price) {
		PassengerJet passengerJet = new PassengerJet(model, speed, range, price);
		passengerJet.loadCrew(); // Load crew onto the passenger jet
		return passengerJet;
	}
}
