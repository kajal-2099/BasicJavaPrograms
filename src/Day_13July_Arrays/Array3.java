//Program to left rotate the elements of an array
package Day_13July_Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[]  arr = new int[] {1,2,4,6};
         int n = 3;
         
         for(int i=0;i<n;i++) {
        	 int first = arr[0],j;
         for(j=0;j<arr.length-1;j++) {
        	 arr[j] = arr[j+1];
         }
         arr[j]= first;
         }
         for(int i=0;i<arr.length;i++)
        	 System.out.println(arr[i]+ " ");
         
	}

}
