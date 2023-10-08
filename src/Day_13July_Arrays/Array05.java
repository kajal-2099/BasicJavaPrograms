// duplicate elements in an array
package Day_13July_Arrays;

public class Array05 {
	static int removeDuplicates(int arr[], int n)
	   {
	      if (n==0 || n==1)
	         return n;
	int j = 0;
	for (int i=0; i<n-1; i++)
	if (arr[i] != arr[i+1])
	arr[j++] = arr[i];
	arr[j++] = arr[n-1];

	return j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
		int n = arr.length;

		n = removeDuplicates(arr, n);

		for (int i=0; i<n; i++)
		System.out.print(arr[i]+" ");
	}

}
