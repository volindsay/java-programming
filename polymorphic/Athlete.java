package exam4;

import java.util.ArrayList;

abstract public class Athlete extends Person {

	private String team;
	private String position;

	abstract public void doThis();

	public Athlete() {
		this(new Name(), 20, "Losers", "Benchwarmer");
	}

	public Athlete(Name name, int age, String team, String position) {
		super(name, age);
		setTeam(team);
		setPosition(position);
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public String getPosition() {
		return position;
	}

	public boolean equals(Object obj) {
		return obj instanceof Golfer;	
//		boolean result = false;
//		if (!(obj instanceof Athlete)) {
//			return false;
//		}
//		
//		if (obj instanceof Athlete) {
//			System.out.println(getName() + " is an Athlete");
//			ArrayList<Athlete> athletes = new ArrayList<Athlete>();
//			athletes.add((Athlete) obj);
//		}
//		return result;
		
		
	}//end equals method override
	
	
	public String toString() {
		String result;
		result = super.toString() + " I am on the " + getTeam() + " and perform the position of " + getPosition()
				+ ". ";
		return result;
	}
}// end Athlete class
