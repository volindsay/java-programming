package polymorphic;

import java.util.*;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {

		Person person = new Person();
		Baseball Hank = new Baseball("Hank Aaron", 18, "Indianapolis Clowns", "Right Fielder", 4, "right-handed");
		Baseball Barry = new Baseball("Barry Bonds", 22, "Pittsburgh Pirates", "Left Fielder", 1, "left-handed");
		Football Terry = new Football("Terry Bradshaw", 22, "Pittsburgh Steelers", "Quarterback", "Offense");
		Football Payton = new Football("Walter Payton", 21, "Chicago Bears", "Running Back", "Offense");
		Hockey Mario = new Hockey("Mario Lemieux", 19, "Pittsburgh Penguins", "Centre", "KOHO");
		Hockey Wayne = new Hockey("Wayne Gretzky", 27, "Los Angeles Kings", "Alternate Captain", "KOHO");
		Golfer Tiger = new Golfer("Tiger Woods", 21, "none", "none", "Titleist");
		Golfer Phil = new Golfer("Phil Mickelson", 22, "none", "none", "Callaway Golf");

		Hank.doThis();
		Barry.doThis();
		Terry.doThis();
		Payton.doThis();
		Mario.doThis();
		Wayne.doThis();
		Tiger.doThis();
		Phil.doThis();

		System.out.println(Hank);
		System.out.println(Barry);
		System.out.println(Terry);
		System.out.println(Payton);
		System.out.println(Mario);
		System.out.println(Wayne);
		System.out.println(Tiger);
		System.out.println(Phil);

	}// end main method
}// end MainClass class
