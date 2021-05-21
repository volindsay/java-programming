//***************************************************************************
//***************************************************************************
//***                                                                     ***
//***                                                                     ***
//***          Written by  :  Vincent Lindsay                             ***
//***          Date written:  09/09/2018                                  ***
//***          Purpose     :  To create a slot machine game               ***
//***                         simulating Aunt Vickie going                ***
//***                         to Las Vegas with 100 quarters.             ***
//***                                                                     ***
//***************************************************************************
//***************************************************************************

// package goes here 
package VickieVegas;

//imports here
import java.util.*;  // import libraries
import java.io.*;

public class VickieVegas {             // starts the VickieVegas class
	public static void main(String[] args) {   
		int jar = 100;                 // jar to play with full of quarters starts at 100.
		playSlots(jar);                // play the game using this method

	} // end main method
	
	public static void playsLeft(int jar) {
		
		System.out.printf("\n==================================\n");
		System.out.printf("=     You have %d plays left.    =\n", jar); // This method will state how many plays are left 
		System.out.printf("==================================\n\n");
		return;
		
	} // end playsLeft method
	
	public static void playSlots(int jar) {

		int slot1 = 0; // counter for slot played time
		int slot2 = 0; // counter for slot played time
		int slot3 = 0; // counter for slot played time
		int timesPlayed = 0; // counter for total times played time
		int i = 0; // misc counter 
		double winnings1 = 25 * .25; // winnings made per machine
		double winnings2 = 75 * .25; // winnings made per machine
		double winnings3 = 5 * .25;  // winnings made per machine

		for (jar = 100; jar > 0; i++) {
			for (int machine = 1; machine <= 3 && jar != 0; machine++) {  // resets every 3rd play and stops if jar is at 0. 
				switch (machine) {
				case 1:
					playsLeft(jar);
					slot1++;  // increment the amount of times played on this slot machine
					jar--;    // decrease the amount of jar quarters 
					timesPlayed++;  // increase total times played
					jar = playSlot1(slot1, jar, timesPlayed, winnings1); // pass above variables and set returned result to jar 
					break;  // leave this case

				case 2:
					playsLeft(jar);
					slot2++;
					jar--;
					timesPlayed++;
					jar = playSlot2(slot2, jar, timesPlayed, winnings2);
					break;

				case 3:
					playsLeft(jar);
					slot3++;
					jar--;
					timesPlayed++;
					jar = playSlot3(slot3, jar, timesPlayed, winnings3);
					break;

				} // end switch

			} // end for loop

		} // end for loop
		
		broke(jar, timesPlayed);  // give a message that you're broke
		return;                    // leave the method
		
	} // end playSlots method

	public static int playSlot1(int slot1, int jar, int timesPlayed, double winnings1) {

		if (slot1 == 35 || (slot1 % 35) == 0) {   // if the value of slot1 is equal to 35 or a multiple of 35

			System.out.printf("\nYou have played %d times.\n", timesPlayed);
			System.out.println("You won on Slot Machine 1.");
			System.out.printf("You won on $%.2f.\n", winnings1);
			jar += 25;
			System.out.printf("You have %d quarters left in the jar totalling $%.2f\n\n", jar, (jar * .25));

		} // end if-else statement
		return jar;
	} // end playSlot1

	public static int playSlot2(int slot2, int jar, int timesPlayed, double winnings2) {

		if (slot2 == 100 || (slot2 % 100) == 0) { // if the value of slot1 is equal to 100 or a multiple of 100

			System.out.printf("\nYou have played %d times.\n", timesPlayed);
			System.out.println("You won on Slot Machine 1.");
			System.out.printf("You won on $%.2f.\n", winnings2);
			jar += 75;
			System.out.printf("You have %d quarters left in the jar totalling $%.2f\n\n", jar, (jar * .25));

		} // end if-else statement
		return jar;
	} // end playSlot2 method

	public static int playSlot3(int slot3, int jar, int timesPlayed, double winnings3) {
		
		if (slot3 == 8 || (slot3 % 8) == 0) {// if the value of slot1 is equal to 8 or a multiple of 8

			System.out.printf("\nYou have played %d times.\n", timesPlayed);
			System.out.println("You won on Slot Machine 3.");
			System.out.printf("You won on $%.2f.\n", winnings3);
			jar += 5;
			System.out.printf("You have %d quarters left in the jar totalling $%.2f\n\n", jar, (jar * .25));

		} // end if-else statement
		return jar;
	}// end playSlot3 method

	public static void broke(int jar, int timesPlayed) {
		
		if (jar == 0) {  // if jar is empty
			
			System.out.printf("\n\n\n\n==================================\n");
			System.out.printf("=            GAME OVER           =\n");
			System.out.printf("==================================\n");
			System.out.printf("\n\nYou played the one armed bandit %d times.\n\n", timesPlayed);
			System.out.println("You are now BROKE. SEE YOU NEXT TIME!");
			
		} // end if
		
	}// end broke method
	
} // end VickieVegas class
