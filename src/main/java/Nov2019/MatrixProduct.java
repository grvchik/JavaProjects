package Nov2019;

public class MatrixProduct {

	public int getMaximumProduct(int[][] matrix) {
		
		int cache[][] = new int[matrix.length][matrix[0].length];
		
		cache[0][0] = matrix[0][0];
		
		for(int i=0;i<matrix.length;i++) {
			
			int []colMatrix = matrix[i];
			
			int max = 0;
			for(int j=0;j<colMatrix.length;j++) {
				
				if(i==0 || j==0) {
					if((i-1)>=0) {
						int product = matrix[i][j]*matrix[i-1][j];
						cache[i][j]= Math.max(matrix[i][j],product );
					}					
					if((j-1)>=0) {
						int product = matrix[i][j]*matrix[i][j-1];
						cache[i][j]= Math.max(matrix[i][j],product );
					}					
				}
				else {
					int topProduct =  matrix[i][j]*cache[i-1][j];
					int sideProduct = matrix[i][j]*cache[i][j-1];
					cache[i][j]= Math.max(topProduct,sideProduct );					
				}				
			}
		}
		System.out.println(cache[matrix.length-1][matrix[0].length-1]);
		return cache[matrix.length-1][matrix[0].length-1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{ 2 ,-5 ,1 },
				          {-3,  6, 8 },
				          { 4,  5, 9 }};
		
	
		
		
		MatrixProduct mp = new MatrixProduct();
		mp.getMaximumProduct(matrix);
		
	}

}
