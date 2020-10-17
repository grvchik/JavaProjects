package Aug2020;

public class FillMatrixAndFindOccurence {

	
	public  static int findOccurenceOfNumber(int [][] matrix,int number) {
		
		int size = matrix.length;
		int rows = size;
		int cols = matrix[0].length;
		fillMatrx(rows-1,cols-1,matrix,1);
		System.out.println(matrix);
		return -1;
	}
	
	
	public static void fillMatrx(int row,int col,int[][] matrix,int number  ) {
		
		if(row<0 ||col<0) {
			return;
		}
		
		//keep colmumn same and decrement the row
		 for(int j = row;j>=0;j--) {
			 matrix[j][col] = number;
		 }
		
		// keep row same and decrement the column
		 for(int i = col;i>=0;i--) {
			 matrix[row][i] = number;
		 }		 
		 
		 fillMatrx(row-1, col-1, matrix, number+1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[4][4];
		findOccurenceOfNumber(matrix, 4);
	}

}
