package exam4;

public class Person {

	private Name name;
	private int age;

	public Person() {
		this(new Name("Give", "A", "Name"), 20);
	}

	public Person(Name name, int age) {
		setName(name);
		setAge(age);
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Name getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Object obj) {
		return obj instanceof Person;
	}
	
	public String toString() {
		String result;
		result = "My name is " + getName() + " and I am " + getAge() + " years old.";
		return result;
	}

}// end Person class
