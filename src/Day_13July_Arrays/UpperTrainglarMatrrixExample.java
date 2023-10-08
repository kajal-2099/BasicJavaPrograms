package Day_13July_Arrays;

public class UpperTrainglarMatrrixExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input_matrix[][] = {
		         { 2, 1, 4 },
		         { 1, 2, 3 },
		         { 3, 6, 2 }
		      };
		      int rows = input_matrix.length;
		      int column = input_matrix[0].length;
		      System.out.println("The matrix is defined as: ");
		      for (int i = 0; i < rows; i++) {
		         for (int j = 0; j < column; j++) {
		            System.out.print(input_matrix[i][j] + " ");
		         }
		         System.out.println();
		      }
		      if (rows != column) {
		         return;
		      } else {
		         for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < column; j++) {
		               if (i > j) {
		                  input_matrix[i][j] = 0;
		               }
		            }
		         }
		         System.out.println("\nThe upper triangular matrix is: ");
		         for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < column; j++) {
		               System.out.print(input_matrix[i][j] + " ");
		            }
		            System.out.println();
		         }
		      }
	}

}

