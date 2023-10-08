package day18_23StaticMethods;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkEvenOdd(18);
	     demo3.checkEvenOdd(32);
	     //can we call void method from println()?
	     //No, we can't call any method with return type as void inside println() because it won;t return any value
	     //System.out.println(checkEvenOdd(25));
	}
	//WAP to check given number is even/odd
	public static void checkEvenOdd(int num) {
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
	}
