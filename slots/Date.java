package exam2retry;

import java.util.*;
import java.time.*;

public class Date {

	Scanner userInput = new Scanner(System.in);
	LocalDate localDate = LocalDate.now();
	private int currentYear = localDate.getYear();
	private int month;
	private int day;
	private int year;
	private int birthMonth;
	private int birthDay;
	private int birthYear;

	public Date(int birthMonth, int birthDay, int birthYear) {
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}

	public int getBirthMonth() {
		return birthMonth;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void birthdayCheck(Name name) {

		do {
			if (month < 1 || month > 12) {
				System.out.printf("Please set a proper birth month for %s: ", name);
				month = Integer.parseInt(userInput.next());
			}
		} while (month < 1 || month > 12);

		this.month = month;

		do {
			if (day < 1 && day > 31) {
				System.out.printf("Please set a proper birth day for %s: ", name);
				day = Integer.parseInt(userInput.next());
			}
		} while (day < 1 && day > 31);
		if ((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)) {

			System.out.printf("Please set a proper birth day for %s (up to 30): ", name);
			day = Integer.parseInt(userInput.next());
		}

		if (month == 2) {
			System.out.printf("Please set a proper birth day for %s (up to 29): ", name);
			day = Integer.parseInt(userInput.next());
		}

		this.day = day;

		do {
			if (year < 1920 || year > currentYear) {
				System.out.printf("Please set a proper birth year for %s: ", name);
				year = Integer.parseInt(userInput.next());
			}
		} while (year < 1920 || year > currentYear);

		this.year = year;

	}// end birthdayCheck

	public String toString() {
		String result;
		result = getBirthMonth() + "/" + getBirthDay() + "/" + getBirthYear();
		return result;
	}

}//end Date class