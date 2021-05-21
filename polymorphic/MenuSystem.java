package exam4;

import java.io.*;
import java.util.*;
import java.lang.*;

public class MenuSystem {

	private int choice;
	Scanner userInput = new Scanner(System.in);

	public MenuSystem(Person[] people) { //ArrayList<Athlete> athletes, ArrayList<Hockey> hockeyPlayers, ArrayList<Football> footballPlayers, ArrayList<Golfer> golfers, ArrayList<Baseball> baseballPlayers, ArrayList<Person> normalPeople

		welcome();

		do {
			menu(choice); // show the menu

			switch (getChoice()) {
			case 1:
				viewPlayers(people);
				break;
			case 2:
				introducePlayers(people);
				break;
			case 3:
				break;
			case 4:
				similarities(people); // , athletes, hockeyPlayers, footballPlayers, golfers, baseballPlayers, normalPeople
				break;
			case 5:
				try {
					clearScreen();
					Thread.sleep(200);
					System.out.println("Thank you for checking out my Exam 4.");
					Thread.sleep(1000);
					System.out.println("Exiting the program...");
					Thread.sleep(1500);
					clearScreen();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			default:

				try {
					Thread.sleep(1500);
					System.out.println("Please select a valid option.");
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

				break;
			}// end switch

		} while (choice != 5); // end doWhile loop

		System.exit(0);

	}// end MenuSystem constructor

	private void clearScreen() {
		System.out.println(
				"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	private void introducePlayers(Person[] people) {
		clearScreen();
		for (Person players : people) {
			if (players != null) {
				try {
					System.out.println(players);
					System.out.println("\n");
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // end try/catch
			} // end if statement
		} // end adv forloop
		System.out.println("Press enter to continue...");
		try {
			System.in.read();
		} catch (IOException e) {
			return; // If the user decides to not follow directions and hit another key, this should
					// still return back to the menu.
		}
		clearScreen();

	}// end introducePlayers method

	private void viewPlayers(Person[] people) {
		int n = 0;
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		try {
			Thread.sleep(500);
			System.out.println("=============================");
			System.out.println("      Loading Players        ");
			System.out.println("=============================");
			System.out.println("\n\n");
			Thread.sleep(1000);
			for (Person players : people) {
				if (players != null) {
					n++;
					System.out.printf("%d. ", n);
					System.out.println(players.getName());
					System.out.println("\n\n\n\n\n");
					Thread.sleep(500);
				} // end if
			} // end adv for loop
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // end try/catch

		System.out.println("Press enter to continue...");
		try {
			System.in.read();
		} catch (IOException e) {
			return; // If the user decides to not follow directions and hit another key, this should
					// still return back to the menu.
		}
		clearScreen();

	}// end viewPlayers method

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public int getChoice() {
		return choice;
	}

	public void welcome() {
		clearScreen();
		try {
			System.out.println("\n\n\n\n\n\n");
			System.out.println("\t\t\t\t========================");
			System.out.println("\t\t\t\t   Welcome to Exam 4.   ");
			System.out.println("\t\t\t\t========================");
			System.out.println("\n\n\n\n\n\n");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clearScreen();
	}// end welcome method

	public void menu(int choice) {

		System.out.println("\t\t\t\t=================================");
		System.out.println("\t\t\t\t            MAIN MENU            ");
		System.out.println("\t\t\t\t=================================");
		System.out.println("\t\t\t\t1. View Athletes");
		System.out.println("\t\t\t\t2. Introduce the Athletes");
		System.out.println("\t\t\t\t3. Make the Athletes do something");
		System.out.println("\t\t\t\t4. List Similar Athletes");
		System.out.println("\t\t\t\t5. Quit");
		System.out.println("\t\t\t\t=================================\n\n\n\n");
		System.out.print("\t\t\t\tSelection: ");
		choice = userInput.nextInt();
		setChoice(choice);

	}// end menu method
//, ArrayList<Athlete> athletes, ArrayList<Hockey> hockeyPlayers,	ArrayList<Football> footballPlayers, ArrayList<Golfer> golfers, ArrayList<Baseball> baseballPlayers, ArrayList<Person> normalPeople
	public void similarities(Person[] people) {
		int n = 0;
		int y = 1;
		for (Person players : people) {
			if (!(people[n] == null)) {
				people[n].equals(people[y]);

//				if (people[n] instanceof Athlete) {
//					athletes.add((Athlete)people[y]);
//				}else if (people[n] instanceof Baseball) {
//					baseballPlayers.add((Baseball)people[y]);
//				}else if (people[n] instanceof Football) {
//					footballPlayers.add((Football)people[y]);
//				}else if (people[n] instanceof Hockey) {
//					hockeyPlayers.add((Hockey)people[y]);
//				}else if (people[n] instanceof Golfer) {
//					golfers.add((Golfer)people[y]);
//				}
//			} // end if
//			y++;
//		}
		n++;
	}}}

} // end MenuSystem Class
