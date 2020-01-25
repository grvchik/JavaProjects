package Dec2019;

public class MatrixSearch {

	public static boolean contains(int[][] arr, int x) {
	    if (arr.length == 0 || arr[0].length == 0) return false;
	    int row = 0;
	    int col = arr.length - 1;

	    while (row < arr[0].length && col >= 0) {
	    	int currItem = arr[row][col];
	        if (currItem== x){
	        	return true;
	        }
	        	
	        if (currItem < x) {
	        	row++;
	        } 
	        else
	        {
	        	 col--;
	        }
	      System.out.println("row"+row+ "col"+col);
	    }

	    return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12}};
		
		boolean res = contains(matrix, 12);
		System.out.println(res);
	}

}
