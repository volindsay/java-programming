////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                          GRADE BOOK                                        //
//                                                                            //
//            CREATED BY: VINCENT LINDSAY                                     //
//            WRITTEN ON: 10/07/18                                            //
//            PURPOSE OF: TO CREATE A GRADEBOOK THAT CAN BE ACCESSED          //
//                        TO SHOW DIFFERENT GRADES AND RECALL THOSE           //
//                        GRADES THAT ARE INPUT BY A 2D ARRAY, FOR            //
//                        LOOPS AND MORE.                                     //
//                                                                            //
//                                                                            //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////
package finaltwodimarray;

import java.util.*;
import java.io.*;
import java.lang.*;

public class FinalTwoDimArray {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); // new scanner
		int[][] gradebook = new int[25][]; // new 2d jagged array

		int choice;
		do {
			showMenu();
			choice = userInput.nextInt();
			switch (choice) {
			case 1:
				fillGradebook(userInput, gradebook);
				break;
			case 2:
				studentAverage(userInput, gradebook);
				break;
			case 3:
				testAverage(userInput, gradebook);
				break;
			case 4:
				classAverage(gradebook);
				break;
			case 5:
				System.out.println("Thanks for checking out my program.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println("Program terminated.");
				break;
			default:
				System.out.println("Please input a proper option.\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				break;
			}
		} while (choice != 5);

	}// end main

	public static void classAverage(int[][] gradebook) {

		double classAverage = 0.0;
		int count = 0;
		int total = 0;
		int test = 0;
		for (int student = 0; student < gradebook.length; student++) {
			if (gradebook[student] == null || test >= gradebook[student].length) { // checks to make sure a value is
																					// available
				System.out.printf("Student%2d has not taken any tests.\n", student + 1); // states if a student has not
																							// taken any tests
			} else {
				for (int studentTotal : gradebook[student]) { // enhanced for loop to go through the array
					total += studentTotal; // total for the class
					count++; // count for the amount of tests each student has taken
				}
			}
		}

		classAverage = total / count;

		try {
			System.out.printf("The class average is: %.2f\n", classAverage);
			Thread.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}// end classAverage

	public static void testAverage(Scanner userInput, int[][] gradebook) {

		double total = 0.0;
		double testAverage = 0.0;
		int test;
		int count = 0;

		System.out.print("Enter a test number to see the average: ");
		test = userInput.nextInt() - 1;

		count = 0;
		testAverage = 0;
		total = 0;

		for (int row = 0; row < gradebook.length; row++) {
			if (gradebook[row] == null || test >= gradebook[row].length) {
				System.out.println("Student has not taken this test.");
			} else {
				System.out.println("Test: " + (test + 1) + "Score: " + gradebook[row][test]);

				total += gradebook[row][test];
				if (gradebook[row][test] > 0)
					count++;
			}
		} // end row loop
		testAverage = total / count;
		System.out.printf("Test: " + (test + 1) + "   Avg: %.2f\n", testAverage);
	} // end testAverage

	public static void studentAverage(Scanner userInput, int[][] gradebook) {

		double total = 0.0;
		double average = 0.0;
		int student;
		char answer;
		boolean another = true;
		boolean wrongAnswer = false;
		int count = 0;
		do {
			do {
				System.out.print("Enter a Student ID (1-25) to see their average: ");
				student = userInput.nextInt() - 1;
				if (student < 0 || student > 25) {
					System.out.println("Please enter a proper Student ID.");
				}
			} while (student < 0 || student > 25);
			if (student >= 0 || student < 25) {
				count = 0;
				average = 0;
				total = 0;
				for (int col = 0; col < gradebook[student].length; col++) { // for loop for math of average
					total += gradebook[student][col];
					count++;
					average = total / count;
					System.out.printf("Student ID: " + (student + 1) + "   Avg: %.2f\n", average);
				}
			} else {
				System.out.println("Please input a proper Student ID."); // tell the user to input a proper number
				try {
					Thread.sleep(2000); // pause for 2 seconds to give error
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // end try/catch
			} // end if/else if/else
			do {
				System.out.print("Input another student (y/n): "); // ask user if they want to check another student
				answer = userInput.next().charAt(0); // check for next character input from user
				switch (answer) {
				case 'y':
				case 'Y':
					another = true;
					break;
				case 'N':
				case 'n':
					another = false;
					break;
				default:
					System.out.println("Invalid choice");
					wrongAnswer = true;
					break;
				}// end switch
			} while (wrongAnswer == true); // end do/while and force if wrong answer
		} while (another == true);

	}// end studentAverage

	public static void fillGradebook(Scanner userInput, int[][] gradebook) {
		int id; // student id
		char answer; // answer for question below
		boolean another = true; // true or false for another student
		int tests = 0; // how many tests
		int test; // test number
		boolean wrongAnswer = false;
		do {

//	      I left this here to get your opinion on it. I could not figure out how to make a user check to make
//	      sure that the user is not overriding their own inputs by accidently selecting the same number. 
//			
//			if (grades[id].length != 1) {
//				System.out.println("Are you sure you want to overwrite this student (y/n): ");
//				char override = userInput.next().charAt(0);
//			}

			do {

				System.out.print("Pick a student ID (1-25): "); // ask the user for the student ID
				id = userInput.nextInt() - 1; // subtract 1 to make it in the proper index location
				if (id < 0 || id > 24) { // if the input is outside of the range, give an error
					System.out.println("Please choose a proper option.");
				} // end if
			} while (id < 0 || id > 24); // end do/while loop // repeat because of prior error.

			do {
				System.out.print("How many tests do you want to enter (1-10): "); // ask user how many tests to input
				tests = userInput.nextInt(); // subtract 1 to have a proper index location
				if (tests < 1 || tests > 10) { // if the input is outside of the range, give an error
					System.out.println("Please choose a proper option.");
				} // end if
			} while (tests < 0 || tests > 9); // end do/while // repeat because of prior error

			// student id | how many tests here
			gradebook[id] = new int[tests]; // initialize how many tests are needed for the array
			for (test = 0; test < tests; test++) {

				System.out.print("Please input test " + (test + 1) + " score: ");
				gradebook[id][test] = userInput.nextInt();

			} // end for
			do {
				System.out.print("Input another student (y/n): "); // ask if another student record required
				answer = userInput.next().charAt(0);
				switch (answer) {
				case 'y':
				case 'Y':
					another = true;
					break;
				case 'N':
				case 'n':
					another = false;
					break;
				default:
					System.out.println("Invalid choice");
					wrongAnswer = true;
					break;
				}// end switch
			} while (wrongAnswer == true); // end do/while and force if wrong answer
		} while (another == true);// end do/while
	}// end fillGradebook

	public static void showMenu() {

		System.out.println("============================");
		System.out.println("=           MENU           =");
		System.out.println("============================");
		System.out.println("1. Input Grades");
		System.out.println("2. Display Student Average");
		System.out.println("3. Display Exam Average");
		System.out.println("4. Display Class Average\n");
		System.out.println("5. Quit");
		System.out.printf("\n\nPick an option: ");

	} // end showMenu

}
