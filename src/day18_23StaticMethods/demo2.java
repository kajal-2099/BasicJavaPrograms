package day18_23StaticMethods;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2.addTwoNumber();
		System.out.println("**************************");
		demo2.addingTwoNumber(10, 20);
		demo2.addingTwoNumber(50, 60);
	}
	static void addingTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
		//return; will written by compiler
	}
	static void addTwoNumber() {
		int num1=10,num2=20;
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}

}
