package Day24_4julyInheritance;
class Country{
	void display() {
		System.out.println("I am display method of country");
	}
}
class State extends Country{
	void calling() {
		System.out.println("I m am calling method of State");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     State s1 = new State();
     s1.calling();
     s1.display();
	}

}
