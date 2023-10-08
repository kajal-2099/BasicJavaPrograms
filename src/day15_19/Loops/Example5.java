package day15_19.Loops;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int count = 0, num = 123456;
         while(num != 0) {
        	 num /=10;
        	 ++count;
         }
         System.out.println("Number of digits:"+count);
	}

}
