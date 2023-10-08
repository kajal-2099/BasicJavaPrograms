package Day5_july_Overriding;
class Animal{
	String color = "White of red";
}
class Dog extends Animal{
	String color = "Black";
	void printColor() {
		System.out.println("Dog color is : "+color);
		System.out.println("Animal color is : "+super.color);
	}
}
public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog d = new Dog();
      d.printColor();
      String s1 = "12 servers";
      System.out.println(s1.matches(".+[\s]servers"));
      System.out.println(s1.indexOf("KAJAL"));
      String[] str = s1.split("KAJAL");
	}

}
