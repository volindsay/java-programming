package polymorphic;

public class Person {

	private String name;
	private int age;

	public Person() {
		this("Give A Name", 20);
	}

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		String result;
		result = "My name is " + getName() + " and I am " + getAge() + " years old.";
		return result;
	}

}// end Person class
