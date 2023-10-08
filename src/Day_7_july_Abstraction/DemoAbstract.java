package Day_7_july_Abstraction;
abstract class Abs{
	abstract void call1();
	abstract void call2();
	void display() {
		System.out.println("Hello");
	}
}
abstract class Abs1{
	abstract void call1();
	abstract void call2();
}
abstract class Abs2{
	void display() {
		
	}
}
public class DemoAbstract extends Abs2 {
	void call1() {
  	  System.out.println("Hello");
    }
	void call2() {
  	  System.out.println("Hey");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DemoAbstract d1 = new DemoAbstract();
	}

}
