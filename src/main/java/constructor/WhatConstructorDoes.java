package constructor;

public class WhatConstructorDoes {
	//what constructor does
	// constructor instantiate instance properties of a class
	//properties=state or behavior= variables or method
	int hand;
	double hair;
	int leg;

	public void goToSchool(int age) {
		if (age>=5)
		{
			System.out.println("go to school");
		}else {
			System.out.println("do not go to school");
		}

	}

	public void merry(int marriageAge) {
		
		if (marriageAge>=25)
		{
			System.out.println("go to merry");
		}else {
			System.out.println("do not go to merry");
		}
    
	}
	
	public static void eat() {
	    System.out.println("i am static, no need constructor");
	}
	

	public static void main(String[] args) {
		WhatConstructorDoes wcd= new WhatConstructorDoes();
		wcd.goToSchool(7);
		wcd.merry(25);
		
		eat();

}
}
