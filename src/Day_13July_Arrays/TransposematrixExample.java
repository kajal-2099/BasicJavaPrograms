package Day_13July_Arrays;

public class TransposematrixExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int original[][]  = {{1,3,4},{2,3,4},{3,4,6}};
      int transpose[][] = new int[3][3];
      for(int i=0;i<3;i++) {
    	  for(int j=0;j<3;j++) {
    	 transpose[i][j] = original[j][i];
    	  }
      }
         System.out.println("Printing Matrix without transpose: ");
         for(int i=0;i<3;i++) {
        	 for(int j=0;j<3;j++) {
        		 System.out.print(original[i][j]+" "); 
        	 }
        	 System.out.println();
    	  }
         System.out.println("Printing Matrix After Transpose:");  
         for(int i=0;i<3;i++){    
         for(int j=0;j<3;j++){    
         System.out.print(transpose[i][j]+" ");    
         }    
         System.out.println();  
	}
	}
}
