/*
 * We will first take mod of K by N (K = K % N) because after every N rotation array will become the same as the initial array. 
Now, we will iterate the array from i = 0 to i = N-1 and check, 
If i < K, Print rightmost Kth element (a[N + i -K]). 
Otherwise, Print array after ‘K’ elements (a[i – K]). 
 
 */
package InterviewPrograms;

public class RotateArray {
   static void RightRoatate(int a[],int n,int k) {
	 // if rotation is greater than size of array
	   k = k%n;
	   for(int i=0;i<n;i++)
	   {
		   if(i<k) {
			   // print rightmost kth element
			   System.out.println(a[n+i-k] + " ");
		   }
		   else {
			   // print array after k elements
			   System.out.println(a[i-k] + " ");
		   }
	   }
	   System.out.println();
   }
	public static void main(String[] args) {
		int Array[] = {1,2,3,4,5};
		int N = Array.length;
		int K = 2;
		RightRoatate(Array,N,K);
		
	}

}
