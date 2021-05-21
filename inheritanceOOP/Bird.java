package inheritanceOOP;

public class Bird extends Animal {
	
	
	private int wingSpan;
	boolean canFly = true;
	
	public Bird(int weightInPounds, int heightInInches, int wingSpan, boolean canFly) {
		super(weightInPounds, heightInInches);
		this.wingSpan = wingSpan;
		this.canFly = canFly;
	}
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	@Override
	public String toString() {
		String result;
		result = "\nType: Bird" +"\nHeight: " + getHeightInInches() + " inches"+ "\nWeight: " + getWeightInPounds() + "lbs" + "\nWing Span: " + getWingSpan() + " inches" + "Can Fly: " + isCanFly();
		return result; 
	}
	
	
	
}
