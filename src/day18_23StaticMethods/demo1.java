package day18_23StaticMethods;

public class demo1 {

	static void addingTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}
	static void addTwoNumber() {
		int num1=10,num2=20;
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addTwoNumber();
		addTwoNumber();
		addTwoNumber();
		System.out.println("**************************");
		addingTwoNumber(10, 20);
		addingTwoNumber(50, 60);
	}

}
