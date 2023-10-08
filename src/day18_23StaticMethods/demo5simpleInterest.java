package day18_23StaticMethods;

public class demo5simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double principal = 4000;
        double time = 2;
        double rate = 10.8;
        double interest = calculateInterest(principal,time,rate);
        printSummary(principal,time,rate,interest);
	}

	private static void printSummary(double principal, double time, double rate, double interest) {
		// TODO Auto-generated method stub
		System.out.print("Interest for Rs" + principal + " for " + time + " year ");
	    System.out.print("at the rate of" + rate + " % p.a is Rs " + interest );
	}
	

	private static double calculateInterest(double principal, double time, double rate) {
		// TODO Auto-generated method stub
		double result = principal * time * rate / 100.0; 
		return result;
	}

}
