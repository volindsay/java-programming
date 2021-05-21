package polymorphic;

import java.util.*;
import java.io.*;

public class Baseball extends Athlete {

	private int battingPosition;
	private String battingStance;
	Scanner userInput = new Scanner(System.in);

	public Baseball(String name, int age, String team, String position, int battingPosition, String battingStance) {
		super(name, age, team, position);
		setBattingPosition(battingPosition);
		setBattingStance(battingStance);
	}

	public void setBattingPosition(int battingPosition) {
		this.battingPosition = battingPosition;
	}

	public void setBattingStance(String battingStance) {
		this.battingStance = battingStance;

		while (!battingStance.equalsIgnoreCase("left-handed") && !battingStance.equalsIgnoreCase("right-handed") && !battingStance.equalsIgnoreCase("both") && !battingStance.equalsIgnoreCase("ambidextrous")) {

			System.out.println("Please enter a valid batting stance: left-handed, right-handed, both, or ambidextrous.");
			System.out.print("Please input a new batting stance: ");
			battingStance = userInput.next();

		}
		this.battingStance = battingStance;

	}// end setBattingStance

	public int getBattingPosition() {
		return battingPosition;
	}

	public String getBattingStance() {
		return battingStance;
	}

	public void doThis() {
		System.out.println("HOMERUN! I hit the ball over the fence!");
	}

	public String toString() {
		String result;
		if (battingStance.equalsIgnoreCase("both")) {
			result = super.toString() + " I bat at " + getBattingPosition() + ". When I do bat, I am hitting from " + getBattingStance() + " sides.";
		} else {
			result = super.toString() + " I bat at " + getBattingPosition() + ". When I do bat, I am " + getBattingStance() + ".";
		}
		return result;
	}

} // end Baseball class
