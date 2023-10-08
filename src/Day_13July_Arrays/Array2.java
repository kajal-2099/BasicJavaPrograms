// Program to find frequency of each element in array
package Day_13July_Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = new int[] {1,2,4,6,7,9,1,2,3,1};
           int [] fr = new int[arr.length];
           int visited = -1;
           for(int i=0;i<arr.length;i++)
           {
        	   int count = 1;
        	   for(int j=i+1;j<arr.length;j++)
        	   {
        		   if(arr[i]==arr[j]) {
        			   count++;
        			   fr[j]=visited;      // to avoid counting same element again
        		   }
        	   }
        	
			if(fr[i]!=visited)
        		   fr[i]=count;
           }
        System.out.println("------------------------");
        System.out.println("Elements| Frequency");
        System.out.println("------------------------");
        for(int i=0;i<fr.length;i++)
        	if(fr[i]!=visited)
        		System.out.println(" "+ arr[i] + " | "+fr[i]);
	}

}
