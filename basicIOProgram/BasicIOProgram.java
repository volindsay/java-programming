///////////////////////////////////////////////////////////////
//											                 //
// Project Name: Basic Input and Output Program              //
// Written By: Vincent Lindsay                               //
// Date Written: 09/02/18                                    //
// Purpose: To write a program that requests numbers from    //
//          the user, adds, divides and reports back to      //
//			the screen for output.                           //
//											                 //
///////////////////////////////////////////////////////////////

package basicIOProgram;
import java.util.Scanner;
public class BasicIOProgram {  // class
	public static void main(String[] args) {   // method
		// Message to the user
		System.out.println("////////////////////////////////////");
		System.out.println("// Basic Input and Output Program //");
		System.out.println("////////////////////////////////////");
		System.out.println("");
		System.out.println("");
		System.out.println("====================================");
		System.out.println(" This program will request three");
		System.out.println(" numbers from you, add and divide.");
		System.out.println("");
		System.out.println(" Thank you.");
		System.out.println("====================================");
		System.out.println("");
		System.out.println("");
		// variables
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		// turn on a scanner and request information from the user
		Scanner userInput = new Scanner(System.in);    // scanner is created and opened
		System.out.print("Enter your first number: "); 
		num1 = userInput.nextInt();                    // num1 gets input
		System.out.print("Enter your second number: ");
		num2 = userInput.nextInt();                    // num2 gets input
		System.out.print("Enter your third number: ");  
		num3 = userInput.nextInt();                     // num3 gets input
		userInput.close();                              // close the input scanner 
		System.out.println("");
		System.out.println("");
		
		// perform calculations here  
		int sum = num1 + num2 + num3; // sum
		float avg = 0.00F;            // initialize average
		avg = sum / 3.00F;            // perform the average
		
		
		// Outputs of the answers to the screen of user numbers, sum and average. 
		System.out.println("The three numbers are: " + num1 + ", " + num2 + " and " + num3);
		System.out.println("The sum of the numbers is: " + sum );
		System.out.println("The average of the numbers is: " + avg);
	} // end main method
} // end BasicIOProgram class
