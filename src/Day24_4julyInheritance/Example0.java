package Day24_4julyInheritance;
class Country100{
	//default constructor
	void display() {
		System.out.println("I am display method of Country");
	}
}
class State100 {
	//default constructor
	void calling() {
		System.out.println("I am calling method of State");
	}
}
public class Example0 {
	void testing() {
		System.out.println("I am testing method of Example0");
	}
	public static void main(String[] args) {
		Country100 c1=new Country100();
		c1.display();		
		State100 s1=new State100();
		s1.calling();		
		Example0 e1=new Example0();
		e1.testing();		
	}
}



