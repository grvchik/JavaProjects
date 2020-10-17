package June2020;

public class MatrixSearch {

	public static boolean doesContainsElement(int[][] matrix,int element,int begrow,int begcol) {
		
		int endrow= matrix.length-1;
		int endcol = matrix[0].length-1;
		
	    if(begrow>endrow ||begcol >endcol) {
	    	return false;
	    }
		
		if(matrix[begrow][begcol]==element) {
			return true;
		}
		else {
			
			if(matrix[begrow][begcol]<element && element < matrix[begrow][endcol]) {
				while(begcol<endcol) {
					begcol++;
					if(matrix[begrow][begcol]==element) {
						return true;
					}
				}
			}
			else {
				while(begrow<endrow) {
					++begrow;
					return doesContainsElement(matrix, element, begrow, begcol);
				}
			}
			
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = { {1,2,3,4} , {5,6,7,8}, {9,10,11,12}};
		boolean res = doesContainsElement(matrix, 6, 0, 0);
	}

}
