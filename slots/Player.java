package exam2retry;

public class Player {

	private Name name;
	private Date birthday;
	private int balance;
	private int wins;
	private int loses;

	public Player() {

	}// end Player constructor

	public Player(Name name, Date birthday, int balance, int wins, int loses) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.balance = balance;
		this.wins = wins;
		this.loses = loses;
	} // end Player constructor

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLoses() {
		return loses;
	}

	public void setLoses(int loses) {
		this.loses = loses;
	}

	public String toString() {
		String result;
		result = "\nName: " + getName() + "\nBirthday: " + getBirthday() + "\nBalance: " + getBalance() + "\nWins: "
				+ getWins() + "\nLoses: " + getLoses();
		return result;
	}

}//end Player class