package Day_7_july_Abstraction;
 abstract class Bike1{
	 abstract void run();
	 void speed(int spd) {
		 System.out.println("Bike spedd: "+spd);
	 }
 }
 class Honda4 extends Bike1{
	 //@override
	 void run() {
		System.out.println("Running safely");
	 }
	 //@override
     void speed(int spd) {
		 System.out.println("Honda4 speed: "+spd);
		 super.speed(120);
	 }
      void color() {
    	  System.out.println("Honda1 color is blue");
      }
 }
 
public class abstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Honda4 obj = new Honda4();
      obj.run();
      obj.speed(50);
      obj.color();
      
      Bike1 b2 = new Honda4();
      b2.run();
      b2.speed(30);
	}

}
