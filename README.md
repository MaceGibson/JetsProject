# Jets Project

## Description
The Jets Application is a Java console application that simulates a fleet of jets with different functionalities. The application includes an `AirField` class to manage the fleet, various jet classes such as `Jet`, `CargoPlane`, and `FighterJet`, and a main application class `JetsApplication` to run the program.

## Technologies Used
- Object-Oriented Programming
- Inheritance and Polymorphism
- Interfaces
- User Input Handling
- ArrayLists
- Menu-Driven User Interface

## Features
1. **Jet Class Hierarchy:** The application includes a hierarchy of jet classes, including an abstract `Jet` class and subclasses such as `CargoPlane` and `FighterJet`.

2. **Interfaces:** Two interfaces, `CargoCarrier` and `CombatReady`, are implemented by specific jet subclasses, providing additional functionalities.

3. **Menu-Driven User Interface:** The program offers a menu with various options, allowing users to list the fleet, fly all jets, view the fastest and longest-range jets, load cargo for cargo planes, engage in a dogfight for fighter jets, add a new jet to the fleet, and remove a jet from the fleet.

4. **Array Lists:** The application utilizes ArrayLists to manage the collection of jets in the airfield.

## Lessons Learned
1. **Inheritance and Polymorphism:** Understanding the use of inheritance to create a hierarchy of classes and polymorphism to treat objects of different classes uniformly.

2. **Interfaces:** Implementing interfaces to define common behaviors for specific types of jets.

3. **Menu-Driven Design:** Designing and implementing a menu-driven user interface for user interaction and control flow.

4. **Array Lists vs. Arrays:** Differentiating between ArrayLists and arrays and choosing the appropriate data structure for managing collections.

## How to Run
1. Clone the repository: `git clone https://github.com/yourusername/JetsApplication.git`
2. Navigate to the project directory: `cd JetsApplication`
3. Compile the Java files: `javac JetsApplication.java AirField.java Jet.java CargoPlane.java FighterJet.java CargoCarrier.java CombatReady.java PassengerJet.java`
4. Run the application: `java JetsApplication`
