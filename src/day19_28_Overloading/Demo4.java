package day19_28_Overloading;

public class Demo4 {
  static double res;
  static public void square(double number) {
	  res = number * number;
	  System.out.println("Method with doubble argument called:"+res);
  }
  static public void sqaure() {
	  int res = 20 * 10;
	  System.out.println("No parameter called: "+res);
	 
  }
  static public void square(int number) {
	  res = number * number;
	  System.out.println("Method with integer argument called:"+res);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo4.square(2);
         Demo4.sqaure();
         Demo4.square(5.56f);
	}

}
