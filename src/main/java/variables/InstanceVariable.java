package variables;

public class InstanceVariable {
	private  String firstName="sharna" ;
	String middleName;
	
	//inside the class and 
	//out side of any method,constructor or block
	// the scope is the whole class
	//declaration =String firstName ;
	//Initialization=firstName="Sabrina";
	//Initialization is not mandatory, 
	//Initialization is not prefer
	//Initialization is default value
	//any access modifier is allowed
	//in c# it is called global variable

	public static void main(String[] args) {
		
		InstanceVariable iv = new InstanceVariable();
		iv.sabrina();
		iv.sayed();
		iv.faruq();
	}

	
	public void sabrina() {
		firstName="Sabrina";
		System.out.println(firstName);
		middleName="A";
	}
	
	
public void sayed() {
	 firstName="Sayed";	
	 System.out.println(firstName);
	 middleName="B";
	}

public void faruq() {
	 firstName="Faruq";	
	 System.out.println(firstName);
	 
	}

}



