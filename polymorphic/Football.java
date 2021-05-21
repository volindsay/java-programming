package polymorphic;

import java.util.*;
import java.io.*;

public class Football extends Athlete {

	private String specialty;
	Scanner userInput = new Scanner(System.in);

	public Football(String name, int age, String team, String position, String specialty) {
		super(name, age, team, position);
		setSpecialty(specialty);
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;

		while (!specialty.equalsIgnoreCase("Offense") && !specialty.equalsIgnoreCase("Defense") && !specialty.equalsIgnoreCase("Special Teams")) {

			System.out.println("Please enter a valid specialty: Offense, Defense or Special Teams.");
			System.out.print("Please input a new specialty : ");
			specialty = userInput.next();

		}
		this.specialty = specialty;

	}// end setSpecialty

	public String getSpecialty() {
		return specialty;
	}

	public void doThis() {
		System.out.println("I tackled the referee on accident!");
	}

	public String toString() {
		String result;
		result = super.toString() + " My specialty is " + getSpecialty() + ".";

		return result;
	}

}// end Football class
