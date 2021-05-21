package compositeClass2;



public class Name {
	

	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name() {
		
	}
	
	public Name(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
		
	}
	
	public Name(String firstName, String middleName, String lastName) {
		
		setFirstName(firstName);
		setMiddleName(middleName);
		setLastName(lastName);
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		// To change the name to a standard output.  
		firstName = firstName.toLowerCase();
		char firstLetter = firstName.toUpperCase().charAt(0);
		firstName = firstLetter + firstName.substring(1,  firstName.length());
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		// To change the middle name to a standard output.
		middleName = middleName.toLowerCase();
		char firstLetter = middleName.toUpperCase().charAt(0);
		middleName = firstLetter + middleName.substring(1, middleName.length());
		this.middleName = middleName;
	}
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		
		// To change the last name to a standard output.
		lastName = lastName.toLowerCase();
		char firstLetter = lastName.toUpperCase().charAt(0);
		lastName = firstLetter + lastName.substring(1,  lastName.length());
		this.lastName = lastName;
	}

	
	public String toString() {
		
		// if conditional to select the proper string output based on how many inputs are given above. 
        if (middleName == null){
        	return  firstName + " " + lastName;
        } else {    
        	 return firstName + " " + middleName + " " + lastName;
        }
    }
	
	
	
}
