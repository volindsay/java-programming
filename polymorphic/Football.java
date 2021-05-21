package exam4;

import java.util.*;
import java.io.*;

public class Football extends Athlete {

	private String specialty;
	Scanner userInput = new Scanner(System.in);
	ArrayList<Football> football = new ArrayList<Football>();
	
	
	public Football(Name name, int age, String team, String position, String specialty) {
		super(name, age, team, position);
		setSpecialty(specialty);
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;

		while (!specialty.equalsIgnoreCase("Offense") && !specialty.equalsIgnoreCase("Defense")
				&& !specialty.equalsIgnoreCase("Special Teams") && !specialty.equalsIgnoreCase("Multiple")) {

			System.out.println("Please enter a valid specialty for " + getName()
					+ ": Offense, Defense, Special Teams or Multiple.");
			System.out.print("Please input a new specialty : ");
			specialty = userInput.next();

		}
		this.specialty = specialty;

	}// end setSpecialty

	public String getSpecialty() {
		return specialty;
	}

	public void doThis() {
		System.out.println("I, " + getName() + ", tackled the referee on accident!");
	}

	public boolean equals(Object obj) {
		return obj instanceof Football;
//		boolean result = false;
//		if (!(obj instanceof Football)) {
//			return false;
//		}
//
//		if (obj instanceof Football) {
//			System.out.println(getName() + " is a football athlete");
//			football.add((Football) obj);
//		}
//		return result;

	}// end equals method override

	public String toString() {
		String result;
		result = super.toString() + " My specialty is " + getSpecialty() + ".";

		return result;
	}

}// end Football class
