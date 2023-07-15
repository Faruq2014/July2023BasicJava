package constructor;

public class UserDefineCostructor extends Object{
//Class {@code Object} is the root of the class hierarchy.
	// as soon as you create one that is called user define constructor
	//by default constructor has class access modifier
	//Constructor can be private, then you can not create 
	// Referential object from it.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefineCostructor udc = new UserDefineCostructor();
		
	}

	UserDefineCostructor(){
		
	}
	
	protected UserDefineCostructor(String fName){
		
	}
	
	private UserDefineCostructor(String fName,String lName){
		
	}
	

}
