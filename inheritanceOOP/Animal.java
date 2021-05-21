package inheritanceOOP;

public class Animal extends Object { // Object is the default universal super class that all classes use. object > animal > dog etc. 

	private int weightInPounds;
	private int heightInInches;

	public Animal(int weightInPounds, int heightInInches) {
		super();
		setWeightInPounds(weightInPounds);
		setHeightInInches(heightInInches);
	}

	public int getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}
	
	public int getHeightInInches() {
		return heightInInches;
	}
	
	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}

	public String toString() {  //overrides Object toString 
		String result; 
		result = "I am an animal that weighs " + weightInPounds +"lbs and is " + heightInInches + " inches tall.";
		return result; 
	}
	
}
