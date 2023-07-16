package inheritance;

public class InheritanceExplanation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void m1() {
		System.out.println("m1--> public method");
	}

	static protected void m2() {
		System.out.println("m2--> protected method");
	}

	void m3() {
		System.out.println("m3--> default method");
	}
//private method only has access to the same class
	//without getter and setter
	private void m4() {
		System.out.println("m4--> private method");
	}

}
