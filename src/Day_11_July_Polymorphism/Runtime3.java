package Day_11_July_Polymorphism;
class Car{
	int price = 25000;
	void run() {
		System.out.println("Running");
	}
}
class innova extends Car{
	int price = 50000;
}
public class Runtime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car c = new innova();
       c.run();
       System.out.println(c.price);
	}

}
