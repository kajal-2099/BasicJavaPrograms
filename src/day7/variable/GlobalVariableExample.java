package day7.variable;

public class GlobalVariableExample {
	//global variables
		static double salary=45000.56;//static global variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=20,res=num1+num2;
		 System.out.println("num1 is:"+num1);
		 System.out.println("num2 is:"+num2);
		 System.out.println("result is:"+res);
		 System.out.println("Salary is:"+salary);
		 //or
		System.out.println("standard way to access static variable salary: "+GlobalVariableTypes.salary);

	}

}