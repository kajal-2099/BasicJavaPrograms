// third largest no in array
package Day_13July_Arrays;

public class Array04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int temp,size;
      int arr[] = {10,20,30,40,50};
      size = arr.length;
      
      for(int i=0;i<size;i++) {
    	  for(int j=i+1;j<size;j++)
    	  {
    		  if(arr[i]>arr[j]) {
    			  temp = arr[i];
    			  arr[i]= arr[j];
    			  arr[j] = temp;
    		  }
    	  }
      }
		System.out.println("Third largest number: "+arr[size-3]);   // arr[size-2] 2nd largest nd for largest size-1
	}
}
 // 2nd smallest no in array arr[o] 
	/* smallest no 
	 int min = arr[0];

     for(int i=0; i<arr.length; i++) { if(min > arr[i])
         {
            min = arr[i];
         }

     }

     System.out.print(min); 
	*/
