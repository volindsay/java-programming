package inheritanceOOP;

public class Dog extends Animal {

	private String name;
	private String breed;
	private String birthday; 
	

	public Dog(int weight, int height, String name, String breed, String birthday) {
		super(weight, height);
		setName(name);
		setBreed(breed);
		setBirthday(birthday);
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		
		this.birthday = birthday;
	}

	public String toString() {  // overrides Animal toString
		String result;
		// result = "Dog: " + name + " " + super.toString(); // this allows for the toString from the superclass or Animal in this case to come through.
		result = "Type: Dog" + "\nName: " + this.name + "\nBreed: " + this.breed + "\nBirthday: " + this.birthday + "\nHeight: " + getHeightInInches() +" inches"+ "\nWeight: " + getWeightInPounds() +"lbs"; 
		return result; 
	} //end toString
}//end Dog Class
