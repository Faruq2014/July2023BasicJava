package inheritance;
//inheritance only downwards
//by default child use super constructor(parent)
public class GrandChild extends Child{

	public static void main(String[] args) {
		GrandChild gh = new GrandChild();
		gh.tv();
		gh.gold();
		gh.car();
		
	}

	public void playStation() {
		
	}
	public void toys() {
		
	}
	
	
}
