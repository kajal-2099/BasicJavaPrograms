package day15_19.Loops;

public class demo4_Prime {
	  static void checkPrime(int n) {
		  int  i,m=0,flag=0;
		  m = n/2;
		  if(n == 0 || n == 1) {
			  System.out.println(n+ " is not prime number");
		  }
		  else {
			  for(i=2;i<=m;i++) {
				  if(n%i==0) {
					  System.out.println(n+ " is not prime number");
					  flag = 1;
					  break;
				  }
			  }
			  if(flag==0) {
				  System.out.println(n+ " is prime number");
			  }
		  }
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        checkPrime(1);
        checkPrime(5);
        checkPrime(15);
        checkPrime(19);
        checkPrime(21);
        
	}

}
