package Day24_4julyInheritance;
class fruit {
	fruit(){
		System.out.println("fruit class cons..");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class apple extends fruit {
	apple(){
		//super(); //java compiler will write default super()
		System.out.println("Apple class Cons..");
	}
	public void shape() {
		System.out.println("Apple is round");
	}
}
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apple fr = new apple(); // object of child class
		fr.taste(); // call method of parent class
		fr.shape(); // call method of child class
	}
}


