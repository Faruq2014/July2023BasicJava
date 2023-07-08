package dataType;

public class StringDataType {

	public static void main(String[] args) {
		/*
		 * build full name
		 * 
		 */
		
		String firstName="Faruq";//Compiler does not know
		String lastName="Molla";
		String fullName=firstName+lastName;
		System.out.println(fullName);
	
		
		String familyName="Molla";//Compiler does not know
		System.out.println("My family name is "+familyName );
		String nickName="bh234*~";
		System.out.println("My nick name is "+nickName );
		String fullname1=nickName+"   "+familyName;
		System.out.println("my full name is "+fullname1);
		
		// inside "" anything is allow
		// only addition is allow for string, no other arithmetical function is allow
		// what is concatenation
		// concatenation is extra message in between the "" 
		//what is over loading operator
		// in java + is doing two jobs, addition and concatenation
		// so + is called over loading operator
		// 
		
		

	}

}
