// Program to copy all elements of one array to another array
package Day_13July_Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {7,8,5,3};
        int[] copyArr = new int[a.length];
        for(int i=0;i<a.length;i++) {
        	copyArr[i] = a[i];
        	System.out.println("The original array is: ");
        	for(int i1=0;i1<a.length;i1++)
        	{
        		System.out.println(a[i1] + " ");
        	}
        	System.out.println("\n\n Contents of the copied array is");
        	for(int i2=0;i2<copyArr.length;i++)
        		System.out.println(copyArr[i] + " ");
        }
	}
}