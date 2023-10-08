package Day_7_july_Abstraction;
interface Drawable{
	int salary = 25000;
	void draw();
}
class Rectangle1 implements Drawable{
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Interface variable salary:"+Drawable.salary);
       Rectangle1 r1 = new Rectangle1();
       r1.draw();
       Circle c1  = new Circle();
       c1.draw();
       Drawable d = new Circle();
       d.draw();
	}

}
