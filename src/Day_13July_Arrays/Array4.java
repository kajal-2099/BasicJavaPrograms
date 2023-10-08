// Program to print duplicate elements in array 
package Day_13July_Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = new int[] {1,2,4,3,3,6,7,8,8};
      System.out.println("Duplicate elements in an array: ");
      for(int i=0;i<arr.length;i++)
    	  for(int j=i+1;j<arr.length;j++)
    		  if(arr[i]==arr[j])
    			  System.out.println(arr[j]);
	}

}
