package variables;

public class AllVariables {
/*
 * build an application Khan family
 * 
 */
	static String lastName="Khan";
	private String firstName;
	
	
	public static void main(String[] args) {
		AllVariables av= new AllVariables();
		av.sabrin();
		av.sayed();
		av.faruq();
	}
	
	public void sabrin() {
		
		double chekingBalance=2000.45;
		float savingBalance=2000.45f;
		double totalWealth=chekingBalance+savingBalance;
		
		firstName="Sabrina";
		String fullName= firstName +" "+lastName;
		
		System.out.println("my full name is "+ fullName);		
		System.out.println("my cash flow "+ totalWealth);
		
		
	}
public void sayed() {
		
		double chekingBalance=3000.45;
		float savingBalance=5000.45f;
		double totalWealth=chekingBalance+savingBalance;
		
		firstName="Sayed";
		String fullName= firstName +" "+lastName;
		
		System.out.println("my full name is "+ fullName);		
		System.out.println("my cash flow "+ totalWealth);
		
		
	}

public void faruq() {
	
	double chekingBalance=1000.45;
	float savingBalance=1000.45f;
	double totalWealth=chekingBalance+savingBalance;
	
	firstName="Faruq";
	lastName="Molla";
	String fullName= firstName +" "+lastName;
	
	System.out.println("my full name is "+ fullName);		
	System.out.println("my cash flow "+ totalWealth);
	
	
}
}
