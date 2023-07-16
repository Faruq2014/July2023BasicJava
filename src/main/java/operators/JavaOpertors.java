package operators;

public class JavaOpertors {

	public static void main(String[] args) {
		JavaOpertors jo= new JavaOpertors();
		jo.m1();

	}
	
	public void m1() {
		int money1=6;
		int money2=7;
		
		if(money1 != money2){
		System.out.println( " not equal");
		}
		//***************\\
		
		int money3=6;
		int money4=70;
		
		 if (money3 < money4) {
			System.out.println( " greater than");
		}
		 
		//***************\\
		 if (money4 > money3) {
				System.out.println( " less than");
				
			}
		//***************\\
		int remider= money4%money3; //70/6=4
		System.out.println("reminder "+remider);
		//***************\\
		 if (money4==money3) {
			 System.out.println("do some thing");
		 }else {
			 System.out.println("do not do some thing");
		 }
		 
		 //*********&&*********
		 //both condition must be true
		 int age=24;
		 double money=24000.00;
		 
		 if((age==25)&&(money==24000)) {
			System.out.println("do merry"); 
		 }else{
			 System.out.println("do not merry"); 
		 }
		//************************** 
		//if any one of them true
		 
		 if((age==25)||(money==24000)) {
			System.out.println("do merry OR"); 
		 }else{
			 System.out.println("do not merry OR"); 
		 }
		 
	}

}
