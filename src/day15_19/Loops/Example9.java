package day15_19.Loops;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 11;
        if(n <= 1) {
        	System.out.println("the Number is not Prime Number");
        	return;
        }
        int count = 0;
        int i =1;
        while(i<=n/2) {
        	if(n % i == 0) {
        		count ++;
        	}
        	i++;
        }
        if(count > 1) {
        	System.out.println("The Number is not Prime: "+count);
        }
        else {
        	System.out.println("The Number is Prime: "+count);
        }
        
	}

}
