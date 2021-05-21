//***************************************************************************
//***************************************************************************
//***                     BEER WEIGHT CALCULATOR                          ***
//***                                                                     ***
//***          Written by  :  Vincent Lindsay                             ***
//***          Date written:  09/09/2018                                  ***
//***          Purpose     :  To create a calculator for the amount       ***
//***                         of beer consumption by user showing         ***
//***                         theoretical weight and money spent.         ***
//***                                                                     ***
//***************************************************************************
//***************************************************************************
// package goes here 
package Beer;
//imports here
import java.util.*;
import java.io.*;

// classes below here
public class Beer {
	
	public static final int BEER_CALORIES = 150;              // this is a variable that cannot be changed. 
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); // create a scanner for the input
		
		double consumption = dailyBeers(userInput);  // set consumption variable to the output of dailyBeers method
		double cost = moneySpent(userInput);	     // set cost variable to the output of moneySpent method 
		yearlyStats(consumption, cost, BEER_CALORIES); // give the yearly stats using the variables in parameter
		
		
	} // end main method
	
	public static double dailyBeers(Scanner userInput){
		
		System.out.print("How many beers do you consume a day: ");
		return userInput.nextDouble();   // return the input from the Scanner to main method
				
	}// end dailyBeers method
	
	public static double moneySpent(Scanner userInput) {

		System.out.print("How much do you spend per beer: ");
		return userInput.nextDouble();          // return the input from the Scanner to main method
		
	}//end moneySpent method

	public static void yearlyStats(double consumption, double cost, int BEER_CALORIES) {
		
		 // calculations needed for output in each formatted line. 
		double yearlyBeers = consumption * 365;
		double yearlyCost = cost * yearlyBeers;
		double avgDrink = (double)yearlyBeers / 365;
		double avgCost = yearlyCost / 365;
		double caloricGain = BEER_CALORIES * yearlyBeers;
		double weightGain = consumption * 15;
		double avgGain = weightGain / 365;
		System.out.printf("The amount of beers you drink per year is: %.2f\n", yearlyBeers);
		System.out.printf("This is an average of %.2f beers per day.\n", avgDrink);
		System.out.printf("The amount you spend on beers per year is: $%.2f\n", yearlyCost);
		System.out.printf("You spend on average $%.2f per day.%n", avgCost);
		System.out.printf("Based on this information, without daily exercise and diet, you stand to gain %.2flbs per year drinking this amount of beer.%n", weightGain);
		System.out.printf("This is a total of about %.2f calories per year.\n", caloricGain);
		System.out.printf("Your average weight gained per day was %.2flbs.\n", avgGain);
		return; // head back to main method
	}//end yearlyStats method
} // end Beer class
