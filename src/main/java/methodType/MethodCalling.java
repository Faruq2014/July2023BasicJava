package methodType;


public class MethodCalling {
	
	public MethodCalling() {
		super();
		// TODO Auto-generated constructor stub
	}

	//what is method calling
	/*a method is called by another method
	 * 
	 */
	//what is difference between variable and method
	// variable is the state of an object
	//method is behavior of an object
	String fName;
	static String lName="Khan";
	
	public static void main(String[] args) {
		MethodCalling mc= new MethodCalling();//class referential object/variable
		// how do i create class referential variable?
		
		//MethodCalling= is the class name/is the data type of that variable mc
		//mc= is the name of the variable// you can name any logical name
		//new = is the key word/it is use for building constructor
		//new MethodCalling()= constructor for the MethodCalling class
		mc.firstName();
		//what is cross referential object/variable?
		// Instance method coming inside the static method
		//how to create a cross referential variable?
		//MethodCalling mc= new MethodCalling();
		//
		
		lastName();
		//what is non cross/direct referential object/variable?
		//static method coming inside the static method
		
		// 
		// Instance method coming inside the static method
		// static method coming inside the static method
		
		//static method coming inside the Instance method
		//instance method coming inside the Instance method
		
		
	}
	
	public void firstName() {
		 fName="Sabrina";
		System.out.println("instance method  "+fName );
	}
	
   public static void lastName() {
	   System.out.println("static method "+lName );
	}

}
