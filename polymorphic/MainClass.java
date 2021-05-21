package exam4;

import java.util.*;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {

		// Create the athletes
		// Ages and teams are based on the original teams that they signed with or data
		// was clearly found on. Such as the Indianapolis Clowns do not exist anymore.
		// create the array and load it.
		Person[] people = new Person[100];
//		ArrayList<Athlete> athletes = new ArrayList<Athlete>(1);
//		ArrayList<Hockey> hockeyPlayers = new ArrayList<Hockey>(1);
//		ArrayList<Football> footballPlayers = new ArrayList<Football>(1);
//		ArrayList<Golfer> golfers = new ArrayList<Golfer>(1);
//		ArrayList<Baseball> baseballPlayers = new ArrayList<Baseball>(1);
//		ArrayList<Person> normalPeople = new ArrayList<Person>(1);

		people[0] = new Baseball(new Name("Hank", "Louis", "Aaron"), 18, "Indianapolis Clowns", "Right Fielder", 4, "right-handed");
		people[1] = new Baseball(new Name("Barry", "Lamar", "Bonds"), 22, "Pittsburgh Pirates", "Left Fielder", 1, "left-handed");
		people[2] = new Football(new Name("Terry", "Paxton", "Bradshaw"), 22, "Pittsburgh Steelers", "Quarterback", "Offense");
		people[3] = new Football(new Name("Walter", "Jerry", "Payton"), 21, "Chicago Bears", "Running Back", "Offense");
		people[4] = new Hockey(new Name("Mario", "Lemieux"), 19, "Pittsburgh Penguins", "Centre", "KOHO"); 
		// technically does not have a middle name. Born as Joseph Roger Mario Lemieux.
		people[5] = new Hockey(new Name("Wayne", "Douglas", "Gretzky"), 27, "Los Angeles Kings", "Skater", "KOHO");
		people[6] = new Golfer(new Name("Tiger", "Tont", "Woods"), 21, "none", "none", "Titleist"); // real name is "Eldrick Tont Woods" added Tont as spec requests.
		people[7] = new Golfer(new Name("Phil", "Alfred", "Mickelson"), 22, "none", "none", "Callaway Golf");
		people[8] = new Person(new Name(), 32); // extra people requested in the spec here to end
		people[9] = new Baseball(new Name("George", "Kenneth", "Griffey Jr."), 20, "Seattle Mariners", "Center Fielder", 2, "left-handed");
		people[10] = new Golfer(new Name("Vijay", "Singh"), 19, "none", "golfer", "Red Baron");
		people[11] = new Football(new Name("Dick", "Marvin", "Butkus"), 23, "Chicago Bears", "Linebacker", "Defense");
		people[12] = new Golfer(new Name("Arnold", "Daniel", "Palmer"), 25, "None", "golfer", "Coca-Cola");

		MenuSystem menu = new MenuSystem(people); // athletes, hockeyPlayers, footballPlayers, golfers, baseballPlayers, normalPeople


		
	}// end main method
}// end MainClass class
