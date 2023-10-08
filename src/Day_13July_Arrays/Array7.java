// program to print elments of an array on even or odd position
package Day_13July_Arrays;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]  arr = {1,2,3,4,5,6,9,11};
     System.out.println("Elemnts of given array present on even position:");
     for(int i=1;i<arr.length;i=i+2)
      System.out.println(arr[i]);
     System.out.println("Elemnts of given array present on odd position:");
     for(int i=0;i<arr.length;i=i+2)
    	 System.out.println(arr[i]);
      }

}
