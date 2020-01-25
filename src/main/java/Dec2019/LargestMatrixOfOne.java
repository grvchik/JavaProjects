package Dec2019;

public class LargestMatrixOfOne {

	public static int getLargestOneMatrix(int[][] matrix) {
		
		int rows = matrix.length;
		int cols= matrix[0].length;
		int maxLength=0;
		int maxWidth = 0;
		int left=0;
		int up = 0;
		for (int i = 0;i<rows;i++) {
			
			for(int j =0;j<cols;j++ ) {
				
				if(i==0 || j==0) {
					continue;
				}
				
				if(i-1>=0) {
					left = matrix[i-1][j];
				}
				
				if(j-1>=0) {
					up = matrix[i][j-1];
				}
				
				
				if(matrix[i][j]==1 && left==1 && up == 1) {
					
					if(i!=maxLength) {
						maxLength = maxLength+1;
					}
				
					
					if(j!=maxWidth) {
						maxWidth = maxWidth +1;	
					}
		
					
				}
				
			}// end for
			
		}// end for
		
		return Math.min(maxLength, maxWidth);
	}
	
	public static void main(String g[]) {
	 int[][] nums = { {1,1,1,1},
			          {1,1,1,0},
			          {1,1,1,1}};
	 System.out.println(getLargestOneMatrix(nums));
	}
	
	
}
