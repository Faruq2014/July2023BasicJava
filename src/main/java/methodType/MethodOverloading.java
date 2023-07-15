package methodType;

public class MethodOverloading {
//what is method overloading= same method name with different 
	//method signature
	
	//can have any number of overloaded method 
	//mix and match data types is allowed
	//method over loading also called static binding polymorphism
	
	public static void main(String[] args) {
		
		MethodOverloading mo= new MethodOverloading();
		mo.lastName();
		mo.lasttName("Sabrina");
		mo.lastName("Sabrina", "Khan");
		mo.lastName("Khan", 500000);
		

	}
	
	public void lastName() {
		//full method
		//lastName
		//()=empty parameter
		//method signature=method name +parameter
		System.out.println("empty parameter");
		String lName="Khan";
		System.out.println(lName);
	}
	
	public void lasttName(String lName) {
		//can not have same signature
		//method name=lasttName
		// parameter= String lName
		//method signature=lasttName(String lName)
		System.out.println("String one parameter");
		System.out.println(lName);
	}
	
	public void lastName(String lName, String fName ) {
		//can not have same signature
		//method name=lasttName
		// parameter= String lName and fName
		//method signature=lasttName(String lName, String fName)
		System.out.println("String two parameters");
		System.out.println(fName+" "+lName);
	}
	
	
	public void lastName(String lName, double balance ) {
		//can not have same signature
		//method name=lasttName
		// parameter= mixed data types String lName, double balance
		//method signature=lasttName(String lName)
		System.out.println("mix data types two parameters");
		System.out.println(balance+" "+lName);
	}
	
	
	

}
