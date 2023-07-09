package variables;

public class LocalVariables {

	public static void main(String[] args) {
		LocalVariables lv=new LocalVariables();
		lv.sabrina();
	}
	
	public void sabrina() {
	 double checkingAccount = 555.90;
		
		
		//double =data type
		//variable name=checkingAccount
		//it should be two or less word together, camel casing
		//= is an operator
		//5000 is a value/initialization
		
		
		/*local variable must be initialized;
		 * scope only inside the local method
		 * local variable only can be final
		 */
		System.out.println(checkingAccount);
		
	}
	
	
	public void syed() {
		double savingAccount=77.97;
		System.out.println(savingAccount);
	}

}
