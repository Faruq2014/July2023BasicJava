package methodType;

public class InnerMethodCalling {

	public static void main(String[] args) {
		//instance coming inside static
		
		InnerMethodCalling inc= new InnerMethodCalling();
		inc.m1();
	}

	public void m1() {
     System.out.println("I am m1 method ");
   //instance method coming inside the Instance method
     m2();
	}

	public void m2() {
		System.out.println("I am m2 method ");
		
		//static method coming inside the Instance method
		m3();
	}

	public static void m3() {
		System.out.println("I am m3 method ");
		// static method coming inside the static method
		m4();
	}

	public static void m4() {
		System.out.println("I am m4 method ");
	}

}
