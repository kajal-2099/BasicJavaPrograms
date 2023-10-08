package Day24_4julyInheritance;
class Country1{
	Country1(int i){
		System.out.println("I'm int-para cons");
	}
	void display() {
		System.out.println("I am display method of country");
	}
}
class State1 extends Country1{
	State1(){
		super(25);
		System.out.println("I'm zero-para cons");
	}
	void calling() {
		System.out.println("I m am calling method of State");
	}
}
class City extends State1{
	// default cons with default super()
	void printing() {
		System.out.println("I am printing method city");
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       City c1 = new City();
       c1.calling();
       c1.display();
       c1.printing();
	}

}
