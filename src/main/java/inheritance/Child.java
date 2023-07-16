package inheritance;

import java.util.stream.Stream;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent p = new Parent();// not recommended
		//p is only parent method eligible access
		//by default child acquired everything from parent other than private
		//by default parent can not access child properties
		//one way relationship
		//cyclic relationship not allow
		//p.car(); 
		p.house();
		p.tv();
		p.gold();
		//p.computer(); // parent can not access child properties
		Child c = new Child();//allow but not preffer
		//c.car();
		c.computer();
		
		Parent dynamicPolymormhism= new Child();
		dynamicPolymormhism.car();//this way is preferred
		
		//WebDriver driver =new ChromeDriver();
		
	
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(String name) {
		this();
		// TODO Auto-generated constructor stub
	}

	public void computer() {
		System.out.println("i am child computer method");
	}
	
	private void phone() {
		System.out.println("i am child phone method");

	}
	
	@Override
	public  void car() {
		System.out.println("i am over ridden car method(pink car)");
	}
	@Override
	public  void house() {
		System.out.println("i am child over ridden house method");
	}

	
}
