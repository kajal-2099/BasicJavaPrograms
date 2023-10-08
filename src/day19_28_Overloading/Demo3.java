package day19_28_Overloading;

public class Demo3 {
	static int age = 25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Interest value: "+calculateSimlpeInt(70000, 8.6, 72));
		int p=70000,n=72;
		double r=8.6;
		System.out.println("Interest value: "+calculateSimlpeInt(p,r,n));
		
	}
	
	//(p*r*n)/100
	static double calculateSimlpeInt(int p,double r,int n) {
		double result;
		result=(p*r*n)/100;
		System.out.println("p : "+p);
		System.out.println("r : "+r);
		System.out.println("n : "+n);
		System.out.println("result : "+result);
		return result;
	}    
	}

