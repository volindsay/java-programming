package exam4;

import java.io.*;
import java.util.*;

public class Hockey extends Athlete {

	private String stickBrand;
	Scanner userInput = new Scanner(System.in);

	public Hockey(Name name, int age, String team, String position, String stickBrand) {
		super(name, age, team, position);
		setStickBrand(stickBrand);
		positionCheck(position);

	}

	public void positionCheck(String position) {

		do {
			if (!(position.equalsIgnoreCase("Skater") || position.equalsIgnoreCase("Goalie"))) {
				System.out.println(
						getName() + " must be a \"Skater\" or must be a \"Goalie\". Please enter a valid position.");
				System.out.print("Position(Skater / Goalie): ");
				position = userInput.next();

				setPosition(position);
			} // end if
		} while (!(position.equalsIgnoreCase("Skater") || position.equalsIgnoreCase("Goalie"))); // end do while loop
	}// end positionCheck

	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}

	public String getStickBrand() {
		return stickBrand;
	}

	public void doThis() {

		System.out.println("SLAM! I sit in a penalty box always.");
	}

public boolean equals(Object obj) {
		
		return obj instanceof Hockey;
//		if (!(obj instanceof Hockey)) {
//			result = false;
//		}else if (obj instanceof Hockey) {
//			result = true;
//
//		}
//		return result;
		
		
	}//end equals method override
	
	public String toString() {
		String result;
		result = super.toString() + "I only play with " + getStickBrand() + ".";
		return result;
	}

} // end Hockey class
