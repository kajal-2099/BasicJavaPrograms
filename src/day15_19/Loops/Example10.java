package day15_19.Loops;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int number = 60;              // Positive integer no

	    System.out.print("Factors of " + number + " are: ");

	    // loop runs from 1 to 60
	    for (int i = 1; i <= number; ++i) {

	      // if number is divided by i
	      // i is the factor
	      if (number % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	 */   
	    int number = -60;                    // Negative integer no
	    System.out.print("Factors of " + number + " are: ");

	    // run loop from -60 to 60
	    for(int i = number; i <= Math.abs(number); ++i) {

	      // skips the iteration for i = 0
	      if(i == 0) {
	        continue;
	      }
	      else {
	        if (number % i == 0) {
	          System.out.print(i + " ");
	        }
	      }
	    }

	}

}
