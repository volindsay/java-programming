package exam4;

import java.io.*;
import java.util.*;

public class Name {

	private String firstName;
	private String middleName;
	private String lastName;
	Scanner userInput = new Scanner(System.in);

	public Name() {
		createName();

	}

	public Name(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);

	}

	public Name(String firstName, String middleName, String lastName) {

		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		// To change the name to a standard output.
		firstName = firstName.toLowerCase();
		char firstLetter = firstName.toUpperCase().charAt(0);
		firstName = firstLetter + firstName.substring(1, firstName.length());
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		// To change the middle name to a standard output.

		middleName = middleName.toLowerCase();
		char firstLetter = middleName.toUpperCase().charAt(0);
		middleName = Character.toString(firstLetter);
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {

		// To change the last name to a standard output.
		lastName = lastName.toLowerCase();
		char firstLetter = lastName.toUpperCase().charAt(0);
		lastName = firstLetter + lastName.substring(1, lastName.length());
		this.lastName = lastName;
	}

	void createName() {

		String midName = "";
		boolean hasMiddleName = false;
		System.out.println("=======================================================================================\n\n");
		System.out.println("It seems that you have no provided proper names.");
		System.out.println("Let's get some information from you.\n\n");
		System.out.print("What is the first name of the person: ");
		setFirstName(userInput.nextLine());
		do {
			try {
				System.out.println("Does the person have a middle name (Y/N): ");
				midName = userInput.nextLine();
				if (midName.charAt(0) == 'n' && midName.charAt(0) == 'N') {
					System.out.println("Thank you, no middle name recorded");
					midName = "N";
				} else if (midName.equalsIgnoreCase("y")) {
					System.out.print("What is the person's middle name: ");

					setMiddleName(userInput.nextLine());
				}
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("Please enter a valid selection. ");
			}
		}while (!(midName.equalsIgnoreCase("Y")) && !(midName.equalsIgnoreCase("N"))); // end while loop
		System.out.print("What is the last name of the person: ");
		setLastName(userInput.nextLine());

	}// end createName() method

	public String toString() {

		// if conditional to select the proper string output based on how many inputs
		// are given above.
		if (middleName == null) {
			return firstName + " " + lastName;
		} else {
			return firstName + " " + middleName + " " + lastName;
		}
	}

}