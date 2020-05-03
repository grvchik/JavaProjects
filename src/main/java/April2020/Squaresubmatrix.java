package April2020;

public class Squaresubmatrix {

	public static int getSquareSubMatrix(int[][] matrix) {
	 
		int cache[][] = new int[matrix.length][matrix[0].length];
		
		int max=0;
		  for (int i = 0; i < matrix.length; i++) {
		        for (int j = 0; j < matrix[0].length; j++) {
		            if (matrix[i][j]==1)  {
		            	max = Math.max(max, getSquareSubMatrixRecursion(matrix, i, j, cache));
		              }
		            }
		        }
		  return max;
		    }	
		
		
		
		
	
	
	
	
	public static int getSquareSubMatrixRecursion(int[][] matrix, int row,int col, int[][]cache) {
		
		if(row==matrix.length || col==matrix[0].length) {
			return -1;
		}
		
	
			if( matrix[row][col]==1) {
				return 0;
			}
		
	
		
		if(cache[row][col]>0) {
			return cache[row][col];
		}
		
		   if(row==1 && col==2) {
			   System.out.println( "yes");
		   }
			
			int firstMin = Math.min(getSquareSubMatrixRecursion(matrix, row, col+1, cache), getSquareSubMatrixRecursion(matrix, row+1, col+1, cache));
			cache[row][col] = Math.min(firstMin,getSquareSubMatrixRecursion(matrix, row+1, col+1, cache))+1;
		
		return cache[row][col];
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{0,1,1,1},
				{0,1,1,1},
				{0,1,1,0},
		};
		int res = getSquareSubMatrix(arr);
		System.out.println(res);
	}

}
