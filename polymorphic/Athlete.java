package polymorphic;

abstract public class Athlete extends Person {

	private String team;
	private String position;

	abstract public void doThis();

	public Athlete() {
		this("", 20, "Losers", "Benchwarmer");
	}

	public Athlete(String name, int age, String team, String position) {
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

	public String toString() {
		String result;
		result = super.toString() + " I am on the " + getTeam() + " and perform the position of " + getPosition()
				+ ". ";
		return result;
	}
}// end Athlete class
