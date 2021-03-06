package exam4;

import java.util.ArrayList;

public class Golfer extends Athlete {

	private String mainSponsor;

	public Golfer(Name name, int age, String team, String position, String mainSponsor) {
		super(name, age, team, position);
		setMainSponsor(mainSponsor);
	}

	public void setMainSponsor(String mainSponsor) {
		this.mainSponsor = mainSponsor;
	}

	public String getMainSponsor() {
		return mainSponsor;
	}

	public void doThis() {
		System.out.println("I putt the ball in to the hole for a birdy.");
	}

public boolean equals(Object obj) {
		
		return obj instanceof Golfer;
//		if (!(obj instanceof Athlete)) {
//			return false;
//		}
//		
//		if (obj instanceof Athlete) {
//			return true;
//		}
		
		
		
	}//end equals method override
	
	
	public String toString() {
		String result;
		result = "My name is " + getName() + ". My age is " + getAge() + ". I do not play for a team nor do I have a position. I am a golfer. My main sponsor is " + getMainSponsor() + ".";
		return result;
	}

} // end Golfer class
