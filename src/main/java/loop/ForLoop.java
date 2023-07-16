package loop;

public class ForLoop {

	public static void main(String[] args) {
		ForLoop fl = new ForLoop();
		fl.m1();
		fl.m2();
	}
	
	//increment by 1, start from=0, finished at 10
	public void m1() {
		int begaining =0;
		int end =10;
		for ( begaining = 0; begaining <= end; begaining++) {
			System.out.println(begaining);
			
			
		}
		System.out.println("#################");
	}
	//increment by 10, start from=0, finished at 100
	
	public void m2() {
		for (int i = 1; i <= 100; i+=5) {
			
			System.out.println(i);
		}
	
	}
}



