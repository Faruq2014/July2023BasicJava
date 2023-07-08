package dataType;

public class IntegerDataType {

public static void main(String[] args) {
	System.out.println("hello java");
	
	/*queen give me 20$
	 * buy apple
	 * buy milk
	 * buy cookies
	 * and bring change back
	 * 
	 */
	long moneyGiven=2000000;
	
	int apple=687687;
	short milk=5897;
	long cookies=97878;
	//how do we declare data type
	long totalSpend=apple+milk+cookies; //long is superior data type/bigger container
	long changeBack=moneyGiven-totalSpend;
	System.out.println(changeBack);
	//super container concept of data types
	// how to handle mix data type
	// what upper casting
	// What is down casting
	
}
}
