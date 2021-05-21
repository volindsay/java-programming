package inheritanceOOP;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Animal myPet = new Animal(14, 23);
		
		System.out.println(myPet);
		
//		Dog max = new Dog(30, "Max");
//		max.setWeightInPounds(56);
//		System.out.println(max);
		
		Dog bork = new Dog(50, 25, "Bork", "Dum Doggo", "07/27/2009");
		Cat mittens = new Cat(10, 8, "Mittens", 9);
		Bird cwackers = new Bird(4, 15, 24, true);
		System.out.println();
		System.out.println(bork);
		System.out.println();
		System.out.println(mittens);
		System.out.printf("Mittens has lost a life. Now only %d live(s) left.", (mittens.getLives()-1));
		mittens.setLives(mittens.getLives()-1);
		System.out.println();
		System.out.println(cwackers);
		System.out.printf("\n\n%s attempted to eat the bird and missed. %s now only has %d live(s) left.", mittens.getName(), mittens.getName(), (mittens.getLives()-1));
		mittens.setLives(mittens.getLives()-1);
		
	}//end main method
} // end MainClass
