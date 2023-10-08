package day15_19.Loops;

public class Calculator {
	 public static void main(String [] args) {
		 int num1=10, num2=20;
		 String operation = "Mul";
		 switch (operation) {
		 case "Add":
			 System.out.println(num1 + num2);
			 break;
		 case "Mul":
			 System.out.println(num1 * num2);
		     break;
		 case "Sub":
			 System.out.println(num1 - num2);
			 break;
		 case "Div":
			 System.out.println(num1 / num2);
			 break;
	     default:
	    	 System.out.println("Enter a valid operation");
		 }
	 }

}
