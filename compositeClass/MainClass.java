//***************************************************************************
//***************************************************************************
//***                                                                     ***
//***                                                                     ***
//***          Written by  :  Vincent Lindsay                             ***
//***          Date written:  10/14/2018                                  ***
//***          Purpose     :  To create a program utilizing               ***
//***                         composite classes and objects               ***
//***                         to create multiple users and values         ***
//***                         with checks to make sure the proper         ***
//***                         values are provided by the user.            ***
//***                                                                     ***
//***************************************************************************
//***************************************************************************

// package goes here 


package compositeClass2;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Person[] person = new Person[3];                                         // create a new array of objects type Person
		person[0] = new Person(new Name("John","Doe"), 'M', 130, 53423.45);      
		person[1] = new Person(new Name("JaNe", "Doe"), 'f', 31, -34532.35 );
		person[2] = new Person(new Name("Baby", "Doe"), 'w', 1, 0.00);
		
		Person.displayEntries(person);                                            
		Person.editPerson(person);
		
		
	}
}
