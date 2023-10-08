package day19_28_Overloading;

public class Demo5 {
   public void square() {
	   System.out.println("No parameter method called");
   }
   public void square(int number) {
	   int square = number * number;
	   System.out.println("Method with integer argument called:"+square);
   }
   public void square(float number) {
	   float square = number * number; 
	   System.out.println("Method with float argument called:"+square);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo5 obj = new Demo5();
       obj.square();
       obj.square(5);
	}

}
