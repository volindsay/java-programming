package inheritanceOOP;

public class Cat extends Animal {
	
	private String name;
	private int lives = 9;
	public Cat(int weightInPounds, int heightInInches, String name, int lives) {
		super(weightInPounds, heightInInches);
		this.name = name;
		this.lives = lives;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public String toString() {
		
		String result;
		result = "Type: Cat" + "\nName: " + name + "\nWeight: " + getWeightInPounds() + "lbs" + "\nHeight: " + getHeightInInches() + "\nLives left: " + lives;
		return result;
		
	}

	

}
