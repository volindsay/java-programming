package polymorphic;

public class Hockey extends Athlete {

	private String stickBrand;

	public Hockey(String name, int age, String team, String position, String stickBrand) {
		super(name, age, team, position);
		setStickBrand(stickBrand);
	}

	public void setStickBrand(String stickBrand) {
		this.stickBrand = stickBrand;
	}

	public String getStickBrand() {
		return stickBrand;
	}

	public void doThis() {

		System.out.println("SLAM! I sit in a penalty box always.");
	}

	public String toString() {
		String result;
		result = super.toString() + "I only play with " + getStickBrand() + ".";
		return result;
	}

} // end Hockey class
