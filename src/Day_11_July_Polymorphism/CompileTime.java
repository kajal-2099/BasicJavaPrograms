package Day_11_July_Polymorphism;

public class CompileTime {
	static void sum(int a, int b) {
		int c = a + b;
		System.out.println("Addition of two numbers :" + c);
	}
	static void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Addition of three numbers :" + c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         CompileTime.sum(45, 90, 67);
	}

}
