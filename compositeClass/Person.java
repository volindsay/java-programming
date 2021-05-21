package compositeClass2;

import java.util.Scanner;

public class Person {
///// Everything in the following code should be self explainatory as the variables, constructors and methods are named appropriately. 
	private Name name;
	private char gender;
	private int age;
	private double salary;
	private static Scanner userInput = new Scanner(System.in);

	public Person() {
		name = new Name();
	}

	public Person(Name name, char gender, int age, double salary) {
		getName();
		this.name = name;
		do {
			if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
				System.out.printf("Please set a new gender for %s, M or F only: ", name);
				gender = userInput.nextLine().charAt(0);
			}
		} while (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f');
		this.gender = Character.toUpperCase(gender);
		do {
			if (age < 1 || age > 120) { // age check to make sure within range.
				System.out.printf("Please set a new age for %s, between 1 and 120: ", name);
				age = Integer.parseInt(userInput.nextLine());
			}
		} while (age < 1 || age > 120);
		this.age = age;
		do {
			if (salary < 0) { // salary check to make sure positive
				System.out.printf("Please set a new positive salary for user %s: ", name);
				salary = Double.parseDouble(userInput.nextLine());
			}
		} while (salary < 0);
		this.salary = salary;

	}

	public Name getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		gender = Character.toUpperCase(gender); // force uppercase.
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void editPerson(Person[] person) {
		char editPerson;
		int choice = 0;

		do {
			System.out.println("\n========================================");
			System.out.print("Would you like to edit a person (y/n): ");
			editPerson = userInput.nextLine().charAt(0);
		} while (editPerson != 'y' && editPerson != 'Y' && editPerson != 'n' && editPerson != 'N'); // end dowhile loop
																									// and check for
																									// proper input.

		do {

			if (editPerson == 'Y' || editPerson == 'y') {
				// System.out.println("Who would you like to edit (4 to quit): ");
				System.out.printf("========================================\n\n");
				int counter = 1;
				System.out.println("========================================");
				for (Person w : person) {

					System.out.printf("|   %d   | ", counter);
					System.out.println(w);
					System.out.println("========================================");
					counter++;

				} // end forloop showing entries
				System.out.print("Who would you like to edit (4 to quit): ");

				choice = Integer.parseInt(userInput.nextLine());
			} // end if statement

			// switch to change specific user
			switch (choice) {
			case 1:
				System.out.println("\nChanging Entry 1\n\n\n");
				selectEntryToEdit((choice - 1), person);
				break;
			case 2:
				System.out.println("\nChanging Entry 2");
				selectEntryToEdit((choice - 1), person);
				break;
			case 3:
				System.out.println("\nChanging Entry 3");
				selectEntryToEdit((choice - 1), person);
				break;
			case 4:
				System.out.println("Thanks for checking out my Composite Class program.");
				break;
			}
		} while (choice != 4); // end do while loop of editing

	} // end editPerson method

	private static void selectEntryToEdit(int choice, Person[] person) { // the following is to edit specific members
																			// inside of the object.
		int choice2 = 0;
		do {

			System.out.println("==============================");
			System.out.println("||        1. Name           ||");
			System.out.println("||        2. Age            ||");
			System.out.println("||        3. Gender         ||");
			System.out.println("||        4. Salary         ||");
			System.out.println("||        5. Quit           ||");
			System.out.println("==============================");
			System.out.println();
			System.out.printf("Choose an option: ");

			choice2 = Integer.parseInt(userInput.nextLine());
			if (choice2 != 1 && choice2 != 2 && choice2 != 3 && choice2 != 4 && choice2 != 5) {
				System.out.println("Please choose a proper option.\n\n");
			}

			switch (choice2) {
			case 1:
				System.out.println("You have chosen to change the name.\n");

				System.out.print("New first name: ");
				String newFirstName = userInput.nextLine();

				System.out.print("New middle name: ");
				String newMiddleName = userInput.nextLine();

				System.out.print("New last name: ");
				String newLastName = userInput.nextLine();
				if (newMiddleName.length() < 1) {
					person[choice].name = new Name(newFirstName, newLastName);
				} else {
					person[choice].name = new Name(newFirstName, newMiddleName, newLastName);
				}
				break;
			case 2:
				int newAge = 0;
				System.out.println("You have chosen to change the age.\n");
				do {
					System.out.print("New age: ");
					newAge = Integer.parseInt(userInput.nextLine());
					if (newAge < 1 || newAge > 120) {
						System.out.println("Please input a proper age between 1 and 120.");
					} else {
						person[choice].setAge(newAge);
					}
				} while (newAge < 1 || newAge > 120);
				break;
			case 3:
				System.out.println("You have chosen to change the gender.\n");
				char newGender;
				do {
					System.out.print("New gender (M / F): ");
					newGender = userInput.nextLine().charAt(0);
				} while (newGender != 'M' && newGender != 'm' && newGender != 'F' && newGender != 'f');
				person[choice].setGender(newGender);
				break;
			case 4:
				System.out.println("You have chosen to change the salary.\n");
				System.out.print("New salary: ");
				double newSalary = Double.parseDouble(userInput.nextLine());
				person[choice].setSalary(newSalary);
				break;
			case 5:
				System.out.println("Will not edit anymore of this entry.");
				break;
			default:
				System.out.println("Please enter a proper option.\n");
				break;
			}
		} while (choice2 != 5);

	}

	public static void displayEntries(Person[] person) {
		System.out.println("\n========================================");
		for (Person i : person) {
			System.out.println(i);
		}
	}

	public String toString() {
		return "\nName: " + name + "\nGender: " + gender + "\nAge: " + age + String.format("\nSalary: $%.2f", salary);
	}

}
