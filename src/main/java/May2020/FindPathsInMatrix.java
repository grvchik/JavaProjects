package May2020;

public class FindPathsInMatrix {

	public static int findPathsInMatrix(int[][] matrix) {
		
		int [][]result = new int[matrix.length][matrix[0].length];
		
		for(int i=0;i<matrix.length;i++) {
			
			int []colArray  = matrix[i];
			
			for(int j=0;j<colArray.length;j++) {
				if(i==0 && j==0) {
					result[i][j] = 1;
				}
				// dont have to look at top neighbor
				else if(i==0 && j >0) {
					if(matrix[i][j]==0) {
						result[i][j] = result[i][j] +result[i][j-1]; 
					}
					else {
						result[i][j] = 0;
					}
				}
				// dont have to look at right neighbor
				else if(j==0 && i>0) {
					if(matrix[i][j]==0) {
						result[i][j] = result[i][j] +result[i-1][j]; 
					}
					else {
						result[i][j] = 0;
					}					
				}
				else {
					if(matrix[i][j]==0) {
						result[i][j] = result[i][j] +result[i-1][j]+result[i][j-1]; 
					}
					else {
						result[i][j] = 0;
					}					
				}				
			}
		}
		
		return result[matrix.length-1][matrix[0].length-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {0,0,0},
			   	           {1,0,0},
			   	           {1,0,0}};
		int res = findPathsInMatrix(matrix);
		System.out.println(res);
		
	}

}
