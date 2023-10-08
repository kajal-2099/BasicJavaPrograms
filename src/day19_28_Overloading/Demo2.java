package day19_28_Overloading;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		d1.addTwoNumber();//method body will be executed but we won;t be getting its return value
		System.out.println("Result: "+d1.addTwoNumber());//method body will be executed and also prints its return value
		double r1=d1.addTwoNumber();//method body will be executed and we are storing its return value for future use
	}
	int addingTwoNumber(int num1,int num2) {
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
		return res;
	}
	double addTwoNumber() {
		int num1=10,num2=20;
		int res=num1+num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(res);
		return res;
	}

}
